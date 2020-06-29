package com.kundan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kundan.model.DbConn;

@SpringBootApplication
public class SpringBoot2StarterTestApplication implements CommandLineRunner {
	
	@Autowired
	private DbConn con;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2StarterTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(con);
		
	}
	
	@Bean
	public DbConn con() {
		DbConn c=new DbConn();
		c.setDriver("Mysql-starter");
		c.setUrl("test.starter");
		return c;
	}

}
