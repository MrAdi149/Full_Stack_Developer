from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import (TimeoutException, 
                                      NoSuchElementException,
                                      WebDriverException)
from datetime import datetime
from dateutil import parser
import time
import os
import psutil

def whatsapp_bot():
    chromedriver_path = r"C:\Users\KIIT\Desktop\adi\Full_Stack_Developer\ADVANCE_JAVA\Project\Whatsapp-Web\chromedriver.exe"
    session_dir = r"C:\Users\KIIT\Desktop\adi\Full_Stack_Developer\ADVANCE_JAVA\Project\Whatsapp-Web\WhatsAppSession"

    # Kill existing Chrome processes
    def kill_chrome_processes():
        for proc in psutil.process_iter(['name']):
            if proc.info['name'] in ['chrome.exe', 'chromedriver.exe']:
                try:
                    proc.kill()
                except psutil.AccessDenied:
                    continue
        time.sleep(2)

    kill_chrome_processes()
    
    # Clear previous session
    if os.path.exists(session_dir):
        print("Clearing previous session...")
        os.system(f'rmdir /S /Q "{session_dir}"')
    os.makedirs(session_dir, exist_ok=True)

    # Chrome configuration
    options = webdriver.ChromeOptions()
    options.add_argument(f"--user-data-dir={session_dir}")
    options.add_argument("--allow-running-insecure-content")
    options.add_argument("--ignore-certificate-errors")
    options.add_argument("--disable-notifications")
    options.add_argument("--no-sandbox")
    options.add_argument("--disable-dev-shm-usage")
    options.add_argument("--window-size=1920,1080")
    options.add_experimental_option("excludeSwitches", ["enable-automation"])
    options.add_experimental_option("useAutomationExtension", False)

    service = Service(executable_path=chromedriver_path)
    driver = None

    try:
        driver = webdriver.Chrome(service=service, options=options)
        driver.get("https://web.whatsapp.com/")
        print("Please scan QR code within 2 minutes...")

        # Handle all possible post-scan states
        main_element = WebDriverWait(driver, 180).until(  # Increased timeout to 180 seconds
            lambda d: d.find_element(By.CSS_SELECTOR, 
                "div[data-testid='chat-list'], "  # Main interface
                "div[data-testid='qrcode'], "     # QR code
                "div[aria-label='Link a device'], " # Device linking
                "div[aria-label='Turn on notifications']" # Notification prompt
            )
        )

        # Handle different scenarios
        if "qrcode" in main_element.get_attribute("data-testid"):
            print("QR code expired or not scanned in time!")
            return
        elif "Turn on notifications" in main_element.get_attribute("aria-label"):
            print("Dismissing notification prompt...")
            driver.find_element(By.XPATH, "//div[contains(., 'Turn on desktop notifications')]").click()
            time.sleep(2)
        elif "Link a device" in main_element.get_attribute("aria-label"):
            print("Device linking required! Confirm in mobile app...")
            WebDriverWait(driver, 60).until(
                EC.presence_of_element_located((By.CSS_SELECTOR, "div[data-testid='chat-list']"))
            )

        print("✅ Login successful — bot is running!")

        # Main bot operations
        while True:
            try:
                # Check for unread messages
                unread_chats = WebDriverWait(driver, 30).until(
                    EC.presence_of_all_elements_located(
                        (By.CSS_SELECTOR, "div[aria-label='unread message'], span[aria-label='unread']")
                    )
                )

                for chat in unread_chats:
                    try:
                        chat.click()
                        WebDriverWait(driver, 10).until(
                            EC.presence_of_element_located((By.CSS_SELECTOR, "div[data-testid='conversation-panel-body']"))
                        )

                        # Message handling
                        messages = driver.find_elements(By.CSS_SELECTOR, "div[data-testid='msg-container']")
                        if messages:
                            last_msg = messages[-1]
                            msg_time = WebDriverWait(last_msg, 5).until(
                                EC.visibility_of_element_located((By.CSS_SELECTOR, "div[data-testid='msg-time']"))
                            ).text
                            
                            try:
                                parsed_time = parser.parse(msg_time, fuzzy=True)
                                if (datetime.now() - parsed_time).total_seconds() > 300:
                                    input_box = WebDriverWait(driver, 10).until(
                                        EC.element_to_be_clickable((By.CSS_SELECTOR, "div[title='Type a message']"))
                                    )
                                    input_box.click()
                                    input_box.send_keys("I'm busy right now, I'll reply later")
                                    driver.find_element(By.CSS_SELECTOR, "button[data-testid='compose-btn-send']").click()
                                    print(f"Auto-replied to message from {parsed_time}")
                            except Exception as e:
                                print(f"Message error: {str(e)}")

                        # Return to chat list
                        driver.find_element(By.TAG_NAME, 'body').send_keys(Keys.ESCAPE)
                        time.sleep(1)
                        
                    except Exception as e:
                        print(f"Chat error: {str(e)}")
                        continue

                time.sleep(60)

            except TimeoutException:
                print("No new messages, continuing...")
                continue
                
            except Exception as e:
                print(f"Main loop error: {str(e)}")
                driver.refresh()
                WebDriverWait(driver, 60).until(
                    EC.presence_of_element_located((By.CSS_SELECTOR, "div[data-testid='chat-list']"))
                )

    except Exception as e:
        print(f"Fatal error: {str(e)}")
        if driver:
            driver.save_screenshot('error_screenshot.png')
            print("Screenshot saved as error_screenshot.png")
    finally:
        if driver:
            driver.quit()
            print("Session closed")
        kill_chrome_processes()

if __name__ == "__main__":
    whatsapp_bot()