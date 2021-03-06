package com.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.repository.AccountRepository;
import com.app.repository.JdbcAccountRepository;
import com.app.repository.JpaAccountRepository;
import com.app.service.TxrService;
import com.app.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// by 'third-party' | ' component manager' | 'container' | 'context'

		// init / boot
		System.out.println("--------------------");

		ConfigurableApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("txr-service.xml");

		System.out.println("--------------------");

		// use
		System.out.println("--------------------");

		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.transfer(100.00, "1", "2");
		
		System.out.println("--------------------");

		// destroy
		System.out.println("--------------------");
		context.close();
		System.out.println("--------------------");

	}

}
