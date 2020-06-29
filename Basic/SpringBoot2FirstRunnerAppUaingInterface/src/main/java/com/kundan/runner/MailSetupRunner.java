package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MailSetupRunner implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		return 44;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MailSetupRunner is calling...");

	}

}
