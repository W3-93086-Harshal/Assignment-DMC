package com.sunbeam.Assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Assignment2Application {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("No ambiguity");

        TcpSender ts = ctx.getBean(TcpSender.class);
        HttpSender hs = ctx.getBean(HttpSender.class);
        UdpSender us = ctx.getBean(UdpSender.class);

        ts.send(100.5);
        hs.send(200.7);
        us.send(300.9);

        System.out.println(" Resolved by @Primary ");

        try {
            Sender defaultSender = ctx.getBean(Sender.class);
            System.out.println("Lookup by interface type (Sender.class) successful!");
            defaultSender.send(999.9);
            System.out.println("The default Sender is of type: " + defaultSender.getClass().getSimpleName());
        } catch (Exception e) {
            System.err.println("ERROR: Could not get Sender bean! Exception: " + e.getMessage());
        }
    }
}
