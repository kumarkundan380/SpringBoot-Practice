package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class DataBulkRunner implements CommandLineRunner {
	
	private int id;
	private String title;
	private double version;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "DataBulkRunner [ids=" + id + ", title=" + title + ", version=" + version + "]";
	}

	
}
