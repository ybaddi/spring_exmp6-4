package com.springExmpl.beans;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class SimpleBeanPostProcessor2 implements BeanPostProcessor, Ordered {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("start SimpleBeanPostProcessor2 BeforeInitialization : " + beanName);
//		if(bean instanceof ArticleDataBean) {
//			((ArticleDataBean) bean).setCreationDate(new Date());
//			}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SimpleBeanPostProcessor2 AfterInitialization : " + beanName);
		return bean;
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
