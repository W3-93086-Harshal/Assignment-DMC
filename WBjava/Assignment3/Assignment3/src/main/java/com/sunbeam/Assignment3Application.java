package com.sunbeam;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Assignment3Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            Sender defaultSender = ctx.getBean(Sender.class);
            defaultSender.send(10.5);
        } catch (Exception e) {
            System.err.println("ERROR: Could not get a unique bean of type Sender.");
            System.err.println("Exception details: " + e.getMessage());
        }
    }
}
