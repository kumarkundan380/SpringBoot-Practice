package com.kundan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kundan.model.DbConn;

@Configuration
public class AppConfig {
	
	@Bean
	public DbConn con() {
		DbConn c=new DbConn();
		c.setDriver("Oracle");
		c.setUrl("test");
		return c;
	}

}