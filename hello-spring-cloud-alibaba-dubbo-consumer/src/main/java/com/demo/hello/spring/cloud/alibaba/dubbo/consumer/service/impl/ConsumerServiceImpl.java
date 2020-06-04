package com.demo.hello.spring.cloud.alibaba.dubbo.consumer.service.impl;

import com.demo.hello.spring.cloud.alibaba.dubbo.consumer.service.ConsumerService;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.api.DubboProviderApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


/**
 * @author: 苏敏
 * @date: 2020/6/2 16:32
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(version = "${dubbo-provider.service.version}")
    private DubboProviderApi dubboProviderApi;


    @Override
//    @SentinelResource("getProviderMessage")
    public String getProviderMessage(String str) {

        return dubboProviderApi.providerMessage(str);
    }

//    private static void initFlowRules(){
//        List<FlowRule> rules = new ArrayList<>();
//        FlowRule rule = new FlowRule();
//        rule.setResource("getProviderMessage");
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        // Set limit QPS to 20.
//        rule.setCount(20);
//        rules.add(rule);
//        FlowRuleManager.loadRules(rules);
//    }
}
