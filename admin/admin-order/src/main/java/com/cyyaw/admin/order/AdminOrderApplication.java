package com.cyyaw.admin.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminOrderApplication {


    public static void main(String[] args) {
        SpringApplication.run(AdminOrderApplication.class, args);
    }


}