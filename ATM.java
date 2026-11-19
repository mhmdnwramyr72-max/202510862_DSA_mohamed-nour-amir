/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.startx;

/**
 *
 * @author mohamed nour
 */
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int PIN = 1234;
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            if (sc.nextInt() == PIN) { loggedIn = true; break; }
            attempts++;
            System.out.println("Wrong PIN");
        }
        if (!loggedIn) { System.out.println("Card blocked"); return; }

        double balance = 0;
        String[] history = new String[100];
        int count = 0;
        int choice;

        do {
            System.out.println("1.Balance 2.Deposit 3.Withdraw 4.History 5.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + balance);
            } else if (choice == 2) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                balance += a;
                history[count++] = "Deposit: " + a;
            } else if (choice == 3) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                if (a <= balance) {
                    balance -= a;
                    history[count++] = "Withdraw: " + a;
                } else System.out.println("Insufficient balance");
            } else if (choice == 4) {
                for (int i = 0; i < count; i++)
                    System.out.println(history[i]);
            }
        } while (choice != 5);
    }
}
