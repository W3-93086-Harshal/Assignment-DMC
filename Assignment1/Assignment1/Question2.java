package com.app.Assignment1;


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first double value: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second double value: ");
        double num2 = sc.nextDouble();
        double avg = (num1 + num2) / 2;
        System.out.println("Average: " + avg);
    }
}
