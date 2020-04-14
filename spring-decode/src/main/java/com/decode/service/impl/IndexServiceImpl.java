package com.decode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author FSARSIGHT-IOT-01
 * @date Created in 2019-11-27 15:40
 */
@Service
public class IndexServiceImpl {

	@Resource
	LoginServiceImpl loginService;
	@Autowired
	UserServiceImpl userService;
	IndexServiceImpl(){
		System.out.println("IndexServiceImpl 构造方法");
	}
}
