package com.demo.hello.spring.cloud.alibaba.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 苏敏
 * @date: 2020/6/3 13:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignApplication.class,args);
    }
}
