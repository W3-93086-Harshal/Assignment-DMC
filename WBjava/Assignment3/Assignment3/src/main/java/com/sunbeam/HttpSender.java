package com.sunbeam;

import org.springframework.stereotype.Component;

@Component
public class HttpSender implements Sender{
    @Override
    public void send(double value) {
        System.out.println("Http Sender: Sending value " + value);
    }
}
