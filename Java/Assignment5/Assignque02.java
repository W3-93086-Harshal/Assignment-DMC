package com.app.Assignment05;
// Write a java program to reverse a String //
public class Assignque02{
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println("Date : 02/09/2025");
    }
}