package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.hello.spring.cloud.alibaba.common.dubbo.utils.PageUtils;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.entity.PeopleEntity;

import java.util.Map;

/**
 * 
 *
 * @author 
 * @email 
 * @date 2020-06-04 17:12:21
 */
public interface PeopleService extends IService<PeopleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

