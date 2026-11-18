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

public class SmartRestaurantOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter price of the meal: ");
        double mealPrice = scanner.nextDouble();

        System.out.print("Enter number of drinks ordered: ");
        int drinksCount = scanner.nextInt();

        System.out.print("Is the customer a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter service rating (from 1 to 5): ");
        int rating = scanner.nextInt();

        double discount = 0.0;
        if (isStudent) {
            discount = 0.1; 
        }

        double totalAmount = mealPrice + (drinksCount * 15);
        double discountAmount = totalAmount * discount;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("\n========================================");
        System.out.println("         ORDER SUMMARY   ");
        System.out.println("========================================");
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Final Amount: $" + Math.round(finalAmount));
        System.out.println("========================================");

        scanner.close();
    }
}
