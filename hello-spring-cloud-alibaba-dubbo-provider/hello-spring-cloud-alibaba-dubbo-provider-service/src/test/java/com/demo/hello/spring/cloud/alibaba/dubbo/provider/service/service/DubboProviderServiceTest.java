package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * @author: 苏敏
 * @date: 2020/6/4 18:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class DubboProviderServiceTest {

    @Test
    public void providerMessage() {
    }
}