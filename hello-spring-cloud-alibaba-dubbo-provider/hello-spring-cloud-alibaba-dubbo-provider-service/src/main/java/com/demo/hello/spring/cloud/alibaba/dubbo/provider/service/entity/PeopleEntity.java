package com.demo.hello.spring.cloud.alibaba.dubbo.provider.service.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author 
 * @email 
 * @date 2020-06-04 17:12:21
 */
@Data
@TableName("tb_people")
public class PeopleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Integer age;
	/**
	 * 
	 */
	@TableId
	private String id;

}
