package com.kundan.runner;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class YamlTwoDDataRunner implements CommandLineRunner {

	private Map<String,String> data;
	private Properties grades;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public Properties getGrades() {
		return grades;
	}

	public void setGrades(Properties grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "YamlTwoDDataRunner [data=" + data + ", grades=" + grades + "]";
	}
	
	

}
