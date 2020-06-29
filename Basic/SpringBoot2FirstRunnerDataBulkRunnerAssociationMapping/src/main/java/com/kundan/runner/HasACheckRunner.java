package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.kundan.model.Brand;

@Component
@ConfigurationProperties(prefix = "my.app")
public class HasACheckRunner implements CommandLineRunner {

	private Brand bob;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public Brand getBob() {
		return bob;
	}
	
	public void setBob(Brand bob) {
		this.bob = bob;
	}
	
	@Override
	public String toString() {
		return "HasACheckRunner [bob=" + bob + "]";
	}
	
}
