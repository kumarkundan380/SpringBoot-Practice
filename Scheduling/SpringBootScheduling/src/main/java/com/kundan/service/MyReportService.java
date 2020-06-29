package com.kundan.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportService {
	
	@Scheduled(initialDelay = 2000,fixedDelay = 1000)
	public void showReport() {
		System.out.println("Report -->" + new Date());
	}

}
