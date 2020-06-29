package com.kundan.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileTestRunner implements CommandLineRunner {
	
	@Value("${my.db.driver}")
	private String driver;
	
	@Value("${my.db.url}")
	private String url;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	@Override
	public String toString() {
		return "ProfileTestRunner [driver=" + driver + ", url=" + url + "]";
	}
	

}
