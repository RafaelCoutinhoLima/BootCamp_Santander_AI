package com.example.bootcamp_santander_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BootCampSantanderAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootCampSantanderAiApplication.class, args);
    }

}
