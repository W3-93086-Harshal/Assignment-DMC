package com.sunbeam.Assignment2;


public class TcpSender implements Sender{
    @Override
    public void send(double value) {
        System.out.println("TCP Sender: Sending value " + value + " on port 8080.");
    }
}
