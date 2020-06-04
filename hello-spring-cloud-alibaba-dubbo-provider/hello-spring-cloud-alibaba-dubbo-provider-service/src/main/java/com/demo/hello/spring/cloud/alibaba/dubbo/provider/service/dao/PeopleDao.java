package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.dao;

import com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.entity.PeopleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2020-06-04 17:12:21
 */
@Mapper
public interface PeopleDao extends BaseMapper<PeopleEntity> {
	
}
