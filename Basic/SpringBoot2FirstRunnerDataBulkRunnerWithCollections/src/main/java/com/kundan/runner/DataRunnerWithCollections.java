package com.kundan.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class DataRunnerWithCollections implements CommandLineRunner {

	private List<String> branches;
	private String[] courses;
	private Set<String> slots;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public Set<String> getSlots() {
		return slots;
	}

	public void setSlots(Set<String> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "DataRunnerWithCollections [branches=" + branches + ", courses=" + Arrays.toString(courses) + ", slots="
				+ slots + "]";
	}
	

}
