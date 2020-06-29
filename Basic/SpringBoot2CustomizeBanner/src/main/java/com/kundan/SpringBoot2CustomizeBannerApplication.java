package com.kundan;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2CustomizeBannerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBoot2CustomizeBannerApplication.class, args);
		SpringApplication ac=new SpringApplication(SpringBoot2CustomizeBannerApplication.class);
	//	ac.setBannerMode(Banner.Mode.OFF);
		ac.run(args);
	}

}
