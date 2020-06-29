package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.desc")
public class NoteRunner implements CommandLineRunner{

	private double version;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "NoteRunner [version=" + version + "]";
	}

	
	

}
