package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.fmt.format")
public class FormatRunner implements CommandLineRunner {

	private String sub;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}
	
	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "FormatRunner [sub=" + sub + "]";
	}

	
}
