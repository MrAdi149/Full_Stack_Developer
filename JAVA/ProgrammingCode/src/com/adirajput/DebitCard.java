package com.adirajput;

import java.util.Scanner;

public class DebitCard extends CardInfo {

    int debitMoney;
    Scanner sc = new Scanner(System.in);

    void withdraw() {
        System.out.print("Enter your amount to withdraw: ");
        debitMoney = sc.nextInt();
        if (debitMoney > amount) {
            System.out.println("Insufficient balance.");
        } else {
            amount -= debitMoney;
            System.out.println("Thank you! " + custName + " for withdrawing " + debitMoney + ".");
        }
    }

    void totalMoney() {
        System.out.println("Total money " + amount + " left in your account (" + accNum + ").");
        swipe();
    }

    public static void main(String[] args) {
        DebitCard dc = new DebitCard();
        dc.information();
        dc.withdraw();
        dc.totalMoney();
    }
}
