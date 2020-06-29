package com.kundan.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.kundan.service.AlertService;

@Component
@Profile("social")
public class SocialAlertService implements AlertService {

	@Value("${socal.service}")
	private String service;
	
	@Override
	public void send(String msg) {
		System.out.println(service +":FROM SOCIAL SERVICE:"+msg);
	}

}
