package com.kundan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.test")
@Order(3)
public class TestRunner implements CommandLineRunner {
	
	private int tid;
	private String tmode;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTmode() {
		return tmode;
	}

	public void setTmode(String tmode) {
		this.tmode = tmode;
	}

	@Override
	public String toString() {
		return "TestRunner [tid=" + tid + ", tmode=" + tmode + "]";
	}

	
}
