package com.kundan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kundan.service.AlertService;

@Component
public class ProfileTestRunner implements CommandLineRunner {
	
	@Autowired
	private AlertService alertService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome to profiles");
		alertService.send("Hell User!");

	}

}
