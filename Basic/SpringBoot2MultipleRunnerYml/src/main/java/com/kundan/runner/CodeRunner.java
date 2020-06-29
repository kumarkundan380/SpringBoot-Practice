package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class CodeRunner implements CommandLineRunner {

	private int id;
	private String code;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "CodeRunner [id=" + id + ", code=" + code + "]";
	}
	
	

}
