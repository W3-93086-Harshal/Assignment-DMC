package com.app.Food;

// food menu ordering and bill generation
// Displays a menu, let user select items and quantities, and shows total bill

import java.util.Scanner;

public class Assign2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input from scanner
        int[] prices = {50, 30, 40, 25, 60, 35, 45, 55, 20}; // prices as per menu item
        int total = 0;
        while (true) {
            System.out.println("\n--- Food Menu ---");
            System.out.println("1. Dosa");
            System.out.println("2. Samosa");
            System.out.println("3. Idli");
            System.out.println("4. Vada");
            System.out.println("5. Paneer Tikka");
            System.out.println("6. Poha");
            System.out.println("7. Upma");
            System.out.println("8. Chole Bhature");
            System.out.println("9. Tea");
            System.out.println("10. Generate Bill");
            System.out.print("Select item number (1-10): ");
            int choice = sc.nextInt();
            if (choice == 10) {
                System.out.println("Total Bill: Rs. " + total);
                break;
            } else if (choice >= 1 && choice <= 9) {
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                total += prices[choice - 1] * qty; // Add cost to total
            } else {
                System.out.println("Invalid choice. Try again.");
                System.out.println("Date : 22/08/2025 ");
            }
        }
    }
}