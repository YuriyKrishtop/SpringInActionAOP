package com.mkyong.core;

import com.epam.aop.performers.Guitarist;
import com.epam.aop.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.bo.CustomerBo;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		customer.addCustomer();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
		Performer guitarist = (Guitarist) applicationContext.getBean("performer");
		guitarist.perform();
		
		//customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
//		customer.addCustomerAround("mkyong");

	}
}