package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service;

import com.demo.hello.spring.cloud.alibaba.dubbo.provider.api.DubboProviderApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: 苏敏
 * @date: 2020/6/2 16:29
 */
@Service(version = "${dubbo-provider.service.version}")
public class DubboProviderService implements DubboProviderApi {
    @Override
    public String providerMessage(String str) {
        return String.format("服务提供者接受到服务消费者的信息：" + str);
    }
}
