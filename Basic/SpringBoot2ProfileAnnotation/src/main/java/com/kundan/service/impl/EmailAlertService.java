package com.kundan.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.kundan.service.AlertService;

@Component
@Profile("default")
public class EmailAlertService implements AlertService {

	@Value("${mail.host}")
	private String host;
	
	@Override
	public void send(String msg) {
		System.out.println(host+":FROM MAIL SERVICES:"+msg);

	}

}
