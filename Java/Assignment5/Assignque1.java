package com.app.Assignment05;


import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong (String message){
        super (message);
    }
}

public class Assignque1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");

        String input = sc.nextLine();
        try {
            checkStringLength(input);
            System.out.println("The length of the string is: " + input.length());
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }


    }

    private static void checkStringLength(String Str) throws ExceptionLineTooLong {
        if (Str.length()> 80){
            throw new ExceptionLineTooLong("The String is to Long : ");
        }
    }
}
