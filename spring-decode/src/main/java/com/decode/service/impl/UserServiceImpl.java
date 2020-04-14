package com.decode.service.impl;

import com.decode.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author FSARSIGHT-IOT-01
 * @date Created in 2019-11-26 9:18
 */
@Service
public class UserServiceImpl implements UserService,InitializingBean {

	@Autowired
	IndexServiceImpl indexService;
	UserServiceImpl(){
		System.out.println("UserServiceImpl 构造方法");
	}
	@Override
	public void query() {
		System.out.println("userServiceImpl.query()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("自定义init方法");
	}
}
