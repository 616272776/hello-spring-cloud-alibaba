package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: 苏敏
 * @date: 2020/6/4 11:16
 */
public class DubboProviderServiceFallBack {

    private static final Logger logger = LoggerFactory.getLogger(DubboProviderServiceFallBack.class);

    public static String providerMessageFallBack(String str, Throwable ex) {
        logger.warn("invoke providerMessageFallBack: " + ex.getClass().getTypeName());
        ex.printStackTrace();
        return "invoke providerMessageFallBack";
    }
}
