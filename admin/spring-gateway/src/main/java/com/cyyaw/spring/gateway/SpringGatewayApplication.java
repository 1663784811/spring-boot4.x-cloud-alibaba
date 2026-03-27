package com.cyyaw.spring.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@SpringBootApplication
public class SpringGatewayApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringGatewayApplication.class, args);

        log.info("===============   启动成功  ====================");
        log.info("http://127.0.0.1:9000");

    }

}
