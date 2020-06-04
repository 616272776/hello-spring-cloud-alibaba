package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.hello.spring.cloud.alibaba.common.dubbo.utils.PageUtils;
import com.demo.hello.spring.cloud.alibaba.common.dubbo.utils.Query;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.dao.PeopleDao;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.entity.PeopleEntity;
import com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.service.PeopleService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("peopleService")
public class PeopleServiceImpl extends ServiceImpl<PeopleDao, PeopleEntity> implements PeopleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PeopleEntity> page = this.page(
                new Query<PeopleEntity>().getPage(params),
                new QueryWrapper<PeopleEntity>()
        );

        return new PageUtils(page);
    }

}