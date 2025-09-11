package com.app.Assignment1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        // Display the given number
        System.out.println("Given Number: " + number);

        // Convert and display binary, octal, and hexadecimal equivalents
        System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
        System.out.println("Octal equivalent: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number));

        scanner.close();
    }
}
