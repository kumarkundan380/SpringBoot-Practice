package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.fmt.grade")
public class GradeRunner implements CommandLineRunner {
	
	private int id;

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

	@Override
	public String toString() {
		return "GradeRunner [id=" + id + "]";
	}

}
