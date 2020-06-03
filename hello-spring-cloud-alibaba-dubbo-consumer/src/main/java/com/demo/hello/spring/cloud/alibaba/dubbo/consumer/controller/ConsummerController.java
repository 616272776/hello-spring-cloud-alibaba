package com.demo.hello.spring.cloud.alibaba.dubbo.consumer.controller;

import com.demo.hello.spring.cloud.alibaba.dubbo.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 苏敏
 * @date: 2020/6/2 15:58
 */
@RestController
public class ConsummerController {

    @Autowired
    private ConsumerService consumerService;

//    @SentinelResource(value = "test", blockHandler = "handleException", blockHandlerClass = {ExceptionUtil.class})
//    public void test() {
//        System.out.println("Test");
//    }

//    @SentinelResource(value = "sentinel",blockHandler = "exceptionHandler",fallback = "fallback")
    @GetMapping("/test/{message}")
    public String testDubbo(@PathVariable String message){
        return consumerService.getProviderMessage(message);
    }

//    public String fallback(@PathVariable String message,Throwable throwable){
//        throwable.printStackTrace();
//        return String.format("fallback调用：%s",message);
//    }
//    public String exceptionHandler(@PathVariable String message, BlockException ex){
//        ex.printStackTrace();
//        return String.format("异常调用：%s",message);
//    }
}
