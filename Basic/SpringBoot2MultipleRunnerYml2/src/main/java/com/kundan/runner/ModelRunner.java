package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.desc.note")
public class ModelRunner implements CommandLineRunner {

	private String model;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "ModelRunner [model=" + model + "]";
	}

	
}
