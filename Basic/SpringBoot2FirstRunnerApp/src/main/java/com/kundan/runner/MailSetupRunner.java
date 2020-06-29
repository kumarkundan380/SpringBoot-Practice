package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class MailSetupRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From mail Setup runner");

	}

}
