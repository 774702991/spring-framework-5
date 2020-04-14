package com.decode;

import com.decode.config.Config;
import com.decode.service.UserService;
import com.decode.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author FSARSIGHT-IOT-01
 * @date Created in 2019-11-26 9:13
 */
public class Test {

	public static void main(String[] args) {
		//手动注册bean
		/*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(UserService.class);
		applicationContext.refresh();

		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.query();*/

		//使用注解自动注册bean
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		UserService userService = applicationContext.getBean(UserServiceImpl.class);
		userService.query();

	}
}
