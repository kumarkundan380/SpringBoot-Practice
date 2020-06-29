package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.test")
public class TestRunner implements CommandLineRunner{

	private String mode;
	private String fmt;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	
	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getFmt() {
		return fmt;
	}


	public void setFmt(String fmt) {
		this.fmt = fmt;
	}

	@Override
	public String toString() {
		return "TestRunner [mode=" + mode + ", fmt=" + fmt + "]";
	}


	

}
