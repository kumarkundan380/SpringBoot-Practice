package com.kundan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kundan.model.DbConn;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private DbConn con;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
	}

}
