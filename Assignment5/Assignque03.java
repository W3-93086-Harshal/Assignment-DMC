package com.app.Assignment05;

//Write a java code to check string is palindrome.//


public class Assignque03{
    public static boolean isPalindrome(String str) {

        if (str == null) {

            return false;
        }

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
    public static void main(String[] args) {
        String testString = "madam" ;

        if (isPalindrome(testString)) {

            System.out.println(testString + " is a palindrome.");
        } else {

            System.out.println(testString + " is not a palindrome.");
        }
    }
}