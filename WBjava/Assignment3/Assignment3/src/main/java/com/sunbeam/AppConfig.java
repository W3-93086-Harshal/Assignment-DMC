package com.sunbeam;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration
public class AppConfig {
    @Primary
    @Bean
    public Sender tcpSender() {
        return new TcpSender();
    }

    @Bean
    public Sender httpSender() {
        return new HttpSender();
    }

    @Bean
    public Sender udpSender() {
        return new UdpSender();
    }
}