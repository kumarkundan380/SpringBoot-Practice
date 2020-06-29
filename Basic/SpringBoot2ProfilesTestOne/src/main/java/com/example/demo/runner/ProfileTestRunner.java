package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileTestRunner implements CommandLineRunner {

	@Value("${my.db}")
	private String dbName;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbName);

	}

}
