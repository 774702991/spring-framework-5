package com.decode.mapper;

import com.decode.service.impl.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * 扩展，通过实现 BeanFactoryPostProcessor 接口
 * 修改 BeanDefinition 中的 beanDefinitionMap
 * 将注入的 IndexServiceImpl 修改成 UserServiceImpl
 * @author FSARSIGHT-IOT-01
 * @date Created in 2019-11-27 16:48
 */
//@Component
public class TestBeanPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition
				("indexServiceImpl");
		//com.decode.service.impl.IndexServiceImpl
		System.out.println(beanDefinition.getBeanClassName());
		beanDefinition.setBeanClass(UserServiceImpl.class);
		//com.decode.service.impl.UserServiceImpl
		System.out.println(beanDefinition.getBeanClassName());
	}
}
