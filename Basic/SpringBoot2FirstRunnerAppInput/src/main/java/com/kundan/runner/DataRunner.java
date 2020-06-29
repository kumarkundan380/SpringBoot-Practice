package com.kundan.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {
	
	@Value("${my.app.id}")
	private int id;
	
	@Value("${my.app.title}")
	private String title;
	
	@Value("${my.app.version}")
	private double version;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "DataRunner [id=" + id + ", title=" + title + ", version=" + version + "]";
	}
	
	

}
