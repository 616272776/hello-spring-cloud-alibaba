package com.demo.hello.spring.cloud.alibaba.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 苏敏
 * @date: 2020/6/3 10:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class  GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
