package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.demo.hello.spring.cloud.alibaba.common.dubbo.utils.PageUtils;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.api.DubboProviderApi;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service.fallback.DubboProviderServiceFallBack;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * @author: 苏敏
 * @date: 2020/6/2 16:29
 */
@Service(version = "${dubbo-provider.service.version}")
public class DubboProviderService implements DubboProviderApi {

    @Autowired
    private PeopleService peopleService;

    @Override
    @SentinelResource(value = "getMessage",fallback = "providerMessageFallBack",fallbackClass = DubboProviderServiceFallBack.class)
    public String providerMessage(String str) {
//        throw new IllegalArgumentException();
        PageUtils pageUtils = peopleService.queryPage(new HashMap<>());
        return String.format("服务提供者接受到服务消费者的信息：" + str+"。调用数据库"+pageUtils.toString());
    }
}
