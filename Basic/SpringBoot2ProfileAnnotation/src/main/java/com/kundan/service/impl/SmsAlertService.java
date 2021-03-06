package com.kundan.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.kundan.service.AlertService;

@Component
@Profile("sms")
public class SmsAlertService implements AlertService {

	@Value("${provider.name}")
	private String provider;
	
	@Override
	public void send(String msg) {
		System.out.println(provider+":FROM SMS SERVICE:"+msg);

	}

}
