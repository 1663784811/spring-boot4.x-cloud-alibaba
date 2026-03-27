package com.cyyaw.spring.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class SpringGatewayApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringGatewayApplication.class, args);

        log.info("===============   启动成功  ====================");
        log.info("http://127.0.0.1:9000");

    }

}
