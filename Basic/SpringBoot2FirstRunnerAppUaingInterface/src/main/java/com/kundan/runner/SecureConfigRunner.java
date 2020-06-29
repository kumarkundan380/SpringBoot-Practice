package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SecureConfigRunner implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		return 11;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SecureConfigRunner is calling..");

	}

}
