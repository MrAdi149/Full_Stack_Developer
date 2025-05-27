import os
import re
import time
import PyPDF2
from dotenv import load_dotenv
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import NoSuchElementException, TimeoutException
from bs4 import BeautifulSoup
import requests
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity
import threading

# Load environment variables
load_dotenv('info.env')

class UniversalJobApplicationSystem:
    def __init__(self):
        self.resume_data = self.parse_resume_pdf("Aditya_Kumar_Singh_9122890584.pdf")
        self.driver = webdriver.Chrome()
        self.job_portals = {
            'LinkedIn': 'https://www.linkedin.com/in/aditya-kumar-singh-9980a51ba/',
            'Naukri': 'https://www.naukri.com/nlogin/login',
            'Indeed': 'https://secure.indeed.com/auth',
            'Monster': 'https://www.monsterindia.com/rio/login',
            'HireMee': 'https://student.hiremee.co.in/login',
            'Freshersworld': 'https://www.freshersworld.com/user/login'
        }
        self.credentials = {
            'email': os.getenv('EMAIL'),
            'password': os.getenv('PASSWORD')
        }
        self.job_listings = []
        
    def parse_resume_pdf(self, file_path):
        """Parse resume with fresher-focused information"""
        text = ""
        with open(file_path, "rb") as f:
            reader = PyPDF2.PdfReader(f)
            for page in reader.pages:
                text += page.extract_text()
                
        return {
            "name": "Aditya Kumar Singh",
            "phone": "+91 9122890584",
            "email": "singhadityakumar1911@gmail.com",
            "skills": self.extract_skills(text),
            "training": self.extract_training(text),
            "education": "B.Tech in Information Technology - KIIT University (2020-2024)",
            "projects": self.extract_projects(text),
            "achievements": ["Gold Badge in HackerRank Java", "KIIT Academic Scholarship"]
        }

    def login_to_portal(self, portal_name):
        """Universal login handler for different job portals"""
        login_url = self.job_portals[portal_name]
        self.driver.get(login_url)
        
        try:
            # Wait for login page to load
            WebDriverWait(self.driver, 10).until(
                EC.presence_of_element_located((By.TAG_NAME, "form"))
            )

            # Find email and password fields by common attributes
            email_field = self.driver.find_element(By.XPATH, "//input[contains(@id, 'email') or contains(@name, 'email')]")
            password_field = self.driver.find_element(By.XPATH, "//input[contains(@type, 'password')]")
            
            email_field.send_keys(self.credentials['email'])
            password_field.send_keys(self.credentials['password'])
            
            # Find submit button
            submit_button = self.driver.find_element(By.XPATH, "//button[contains(@type, 'submit')]")
            submit_button.click()
            
            # Handle possible CAPTCHA
            WebDriverWait(self.driver, 15).until(
                lambda d: d.current_url != login_url
            )
            print(f"Logged in to {portal_name} successfully")
            return True
            
        except Exception as e:
            print(f"Login failed for {portal_name}: {str(e)}")
            return False

    def search_jobs(self):
        """Search across multiple job portals"""
        portals = {
            'LinkedIn': self.scrape_linkedin,
            'Naukri': self.scrape_naukri,
            'Indeed': self.scrape_indeed,
            'Freshersworld': self.scrape_freshersworld
        }
        
        for portal, scraper in portals.items():
            try:
                if self.login_to_portal(portal):
                    scraper()
                    time.sleep(3)
            except Exception as e:
                print(f"Error in {portal} search: {str(e)}")
                
        return self.job_listings

    def scrape_indeed(self):
        """Scrape Indeed fresher jobs"""
        self.driver.get("https://www.indeed.com/jobs?q=java+developer&l=India&explvl=entry_level")
        time.sleep(3)
        
        soup = BeautifulSoup(self.driver.page_source, 'html.parser')
        jobs = soup.find_all('div', class_='job_seen_beacon')
        
        for job in jobs:
            title = job.find('h2', class_='jobTitle').text.strip()
            company = job.find('span', class_='companyName').text.strip()
            location = job.find('div', class_='companyLocation').text.strip()
            link = "https://indeed.com" + job.find('a')['href']
            
            self.job_listings.append({
                'title': title,
                'company': company,
                'location': location,
                'link': link,
                'source': 'Indeed',
                'experience': 'Fresher'
            })

    def scrape_freshersworld(self):
        """Scrape FreshersWorld jobs"""
        self.driver.get("https://www.freshersworld.com/java-jobs")
        time.sleep(3)
        
        soup = BeautifulSoup(self.driver.page_source, 'html.parser')
        jobs = soup.find_all('div', class_='col-md-12 col-lg-12 col-xs-12 padding-none')
        
        for job in jobs:
            title = job.find('h3', class_='latest-jobs-title').text.strip()
            company = job.find('div', class_='jobs-location-block').find('h4').text.strip()
            location = job.find('div', class_='jobs-location-pink-text').text.strip()
            link = job.find('a')['href']
            
            self.job_listings.append({
                'title': title,
                'company': company,
                'location': location,
                'link': link,
                'source': 'Freshersworld',
                'experience': '0-1 years'
            })

    def calculate_match_score(self, job_desc):
        """Fresher-focused matching algorithm"""
        resume_text = " ".join([
            ' '.join(self.resume_data["skills"]),
            ' '.join(self.resume_data["projects"]),
            ' '.join(self.resume_data["training"])
        ])
        
        # Give extra weight to fresher-friendly terms
        job_desc += " fresher entry_level 0-1 years"
        
        vectorizer = TfidfVectorizer()
        matrix = vectorizer.fit_transform([resume_text, job_desc])
        return cosine_similarity(matrix[0], matrix[1])[0][0]

    def generate_cover_letter(self, job_title, company):
        """Fresher-focused cover letter"""
        return f"""
Dear Hiring Team,

As a recent B.Tech graduate in Information Technology with hands-on training in Java Full Stack Development 
and multiple project experiences in {', '.join(self.resume_data['skills'][:3])}, I am enthusiastic 
about applying for the {job_title} position at {company}.

Key qualifications I offer:
- Developed {len(self.resume_data['projects'])} complete Java applications during academic training
- Strong foundation in OOP concepts and modern development practices
- Certified in Java programming (HackerRank Gold Badge)
- Active contributor to GitHub projects with 100+ commits

My academic projects like {self.resume_data['projects'][0]} demonstrate my ability to deliver 
functional solutions using Java technologies. I am eager to begin my professional journey with 
{company} and grow as a software developer.

Thank you for considering my application. I would welcome the opportunity to discuss how my 
skills and enthusiasm can contribute to your team.

Sincerely,
{self.resume_data['name']}
        """.strip()

    def smart_form_fill(self):
        """Advanced form filling with common field detection"""
        common_fields = {
            'name': ['fullname', 'name', 'candidateName'],
            'email': ['email', 'id_email'],
            'phone': ['phone', 'mobile', 'contact'],
            'resume': ['resume', 'cv']
        }
        
        for field_type, identifiers in common_fields.items():
            for identifier in identifiers:
                try:
                    element = self.driver.find_element(By.XPATH, f"//*[contains(@id, '{identifier}') or contains(@name, '{identifier}')]")
                    if field_type == 'resume':
                        element.send_keys(os.path.abspath("Aditya_Kumar_Singh_9122890584.pdf"))
                    else:
                        element.send_keys(self.resume_data[field_type])
                    break
                except NoSuchElementException:
                    continue

    def apply_for_job(self, job):
        """Enhanced application assistant"""
        try:
            self.driver.get(job["link"])
            WebDriverWait(self.driver, 10).until(
                EC.presence_of_element_located((By.TAG_NAME, 'body'))
            )
            # Auto-fill common fields
            self.smart_form_fill()
            
            # Display application materials
            print("\n" + "="*50)
            print(f"Applying to: {job['title']} at {job['company']}")
            print(f"Match Score: {self.calculate_match_score(job['title'] + job.get('description', '')):.2f}")
            print("\nCustom Cover Letter:")
            print(self.generate_cover_letter(job["title"], job["company"]))
            
            # Human-completion protocol
            print("\nPlease complete these final steps:")
            print("1. Verify all auto-filled information")
            print("2. Upload resume if not already attached")
            print("3. Review and submit the application")
            
            threading.Timer(180, lambda: print("\nTime remaining: 0 minutes")).start()
            input("Press Enter when done or to continue early...")
            
        except Exception as e:
            print(f"Application error: {str(e)}")

    def run(self):
        try:
            print("Starting universal job search...")
            jobs = self.search_jobs()
            
            print(f"\nFound {len(jobs)} fresher-friendly jobs. Starting applications...")
            for job in jobs:
                if self.calculate_match_score(job['title']) > 0.5:
                    self.apply_for_job(job)
                    time.sleep(2)
                    
        finally:
            self.driver.quit()

    def extract_skills(self, text):
        """Extracts common programming and tech skills from resume text."""
        skills = re.findall(r"(Java|Spring|Hibernate|Android|SQL|Python|JDBC|Servlets|JSP|Git|HTML|CSS|JavaScript|REST API|C\+\+|C#|MongoDB|React|Node\.js)", text, re.IGNORECASE)
        return list(set([skill.strip() for skill in skills]))

    def extract_training(self, text):
        """Improved training/certification extraction with section detection"""
        trainings = []
        # Look for common section headers
        section_pattern = r"(Trainings?|Certifications?|Workshops|Courses):?\s*\n"
        match = re.search(section_pattern, text, re.IGNORECASE)
        
        if match:
            start_idx = match.end()
            end_idx = text.find("\n\n", start_idx)
            training_text = text[start_idx:end_idx].strip()
            
            # Split by bullet points or dashes
            trainings = re.split(r'•|\u2022|\d+\.| - ', training_text)
            trainings = [t.strip() for t in trainings if t.strip()]
            
        return trainings or ["Java Full Stack Training at JSPIDER (2023)"]

def extract_projects(self, text):
    """Improved project extraction with section parsing"""
    projects = []
    # Find projects section using common headers
    section_pattern = r"(Academic Projects|Projects|Key Implementations):?\s*\n"
    match = re.search(section_pattern, text, re.IGNORECASE)
    
    if match:
        start_idx = match.end()
        end_idx = text.find("\n\n", start_idx)
        project_text = text[start_idx:end_idx].strip()
        
        # Split projects by bullet points or numbering
        projects = re.split(r'•|\u2022|\d+\.', project_text)
        projects = [p.strip() for p in projects if p.strip()]
        
    return projects or [
        "Student JDBC Management System: Developed using Java and MySQL",
        "Zest App: Android-based video sharing platform with Firebase backend"
    ]

def scrape_linkedin(self):
    """Complete LinkedIn job scraper for entry-level positions"""
    try:
        self.driver.get("https://www.linkedin.com/jobs/search/?keywords=Java%20Developer&position=1&location=India&f_TPR=r86400&f_E=1")
        time.sleep(3)
        
        # Scroll to load jobs
        for _ in range(3):
            self.driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")
            time.sleep(1.5)
            
        # Wait for job elements to load
        WebDriverWait(self.driver, 10).until(
            EC.presence_of_element_located((By.CLASS_NAME, "jobs-search__results-list"))
        )
        
        soup = BeautifulSoup(self.driver.page_source, 'html.parser')
        jobs = soup.find_all('li', class_='jobs-search-results__list-item')
        
        for job in jobs:
            try:
                title = job.find('a', class_='job-card-list__title').text.strip()
                company = job.find('span', class_='job-card-container__primary-description').text.strip()
                location = job.find('li', class_='job-card-container__metadata-item').text.strip()
                link = job.find('a', class_='job-card-list__title')['href']
                
                self.job_listings.append({
                    'title': title,
                    'company': company,
                    'location': location,
                    'link': link,
                    'source': 'LinkedIn',
                    'experience': 'Entry level'
                })
            except Exception as e:
                print(f"Error parsing LinkedIn job: {str(e)}")
                
        time.sleep(2)
        
    except Exception as e:
        print(f"LinkedIn scraping error: {str(e)}")

def scrape_naukri(self):
    """Complete Naukri.com job scraper for fresher positions"""
    try:
        self.driver.get("https://www.naukri.com/java-developer-jobs?experience=0")
        time.sleep(3)
        
        # Handle location popup
        try:
            self.driver.find_element(By.CLASS_NAME, "crossIcon").click()
            time.sleep(1)
        except NoSuchElementException:
            pass
        
        # Wait for jobs to load
        WebDriverWait(self.driver, 10).until(
            EC.presence_of_element_located((By.CLASS_NAME, "list"))
        )
        
        soup = BeautifulSoup(self.driver.page_source, 'html.parser')
        jobs = soup.find_all('article', class_='jobTuple')
        
        for job in jobs:
            try:
                title = job.find('a', class_='title').text.strip()
                company = job.find('a', class_='comp-name').text.strip()
                location = job.find('li', class_='location').text.strip()
                link = job.find('a', class_='title')['href']
                
                self.job_listings.append({
                    'title': title,
                    'company': company,
                    'location': location,
                    'link': link,
                    'source': 'Naukri',
                    'experience': '0-1 years'
                })
            except Exception as e:
                print(f"Error parsing Naukri job: {str(e)}")
                
        time.sleep(2)
        
    except Exception as e:
        print(f"Naukri scraping error: {str(e)}")

if __name__ == "__main__":
    system = UniversalJobApplicationSystem()
    system.run()