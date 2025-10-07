package com.sunbeam.Assignment2;

public class HttpSender implements Sender{
    @Override
    public void send(double value) {
        System.out.println("HTTP Sender: Sending value " + value + " via POST request.");
    }
}
