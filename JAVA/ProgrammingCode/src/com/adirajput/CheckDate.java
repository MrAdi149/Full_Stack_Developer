package com.adirajput;

//wajp to check the date is valid or not for the leap year also
import java.util.Scanner;

public class CheckDate {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter year: ");
      int year = scanner.nextInt();
      
      System.out.print("Enter month (1-12): ");
      int month = scanner.nextInt();
      
      System.out.print("Enter day: ");
      int day = scanner.nextInt();
      
      boolean isValid = true;
      boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
      
      if (month < 1 || month > 12) {
          isValid = false;
      } else {
          int maxDays;
          switch (month) {
              case 2:
                  maxDays = isLeapYear ? 29 : 28;
                  break;
              case 4: case 6: case 9: case 11:
                  maxDays = 30;
                  break;
              default:
                  maxDays = 31;
          }
          if (day < 1 || day > maxDays) {
              isValid = false;
          }
      }
      
      if (isValid) {
          System.out.println("The date is valid.");
          if (isLeapYear) {
              System.out.println(year + " is a leap year.");
          } else {
              System.out.println(year + " is not a leap year.");
          }
      } else {
          System.out.println("The date is not valid.");
      }
      
      scanner.close();
  }
}

