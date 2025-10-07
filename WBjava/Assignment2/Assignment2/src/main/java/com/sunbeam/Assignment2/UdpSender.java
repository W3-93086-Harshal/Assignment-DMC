package com.sunbeam.Assignment2;


public class UdpSender implements Sender{
    @Override
    public void send(double value) {
        System.out.println("UDP Sender: Sending value " + value + " on port 8080.");
    }
}