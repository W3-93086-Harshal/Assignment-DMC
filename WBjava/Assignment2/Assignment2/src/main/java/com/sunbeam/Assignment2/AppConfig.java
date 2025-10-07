package com.sunbeam.Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
