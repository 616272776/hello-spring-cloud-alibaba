package com.demo.hello.spring.cloud.alibaba.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 苏敏
 * @date: 2020/6/2 15:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
