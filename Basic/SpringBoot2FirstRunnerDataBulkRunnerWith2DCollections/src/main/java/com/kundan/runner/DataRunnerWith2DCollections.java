package com.kundan.runner;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class DataRunnerWith2DCollections implements CommandLineRunner {

	private Map<String,String> details;
	private Properties info;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	public Properties getInfo() {
		return info;
	}

	public void setInfo(Properties info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "DataRunnerWith2DCollections [details=" + details + ", info=" + info + "]";
	}
	
	
	

}
