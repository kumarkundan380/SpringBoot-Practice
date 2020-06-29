package com.kundan.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class YamlOneDCollectionRunner implements CommandLineRunner {

	private List<String> models;
	private String[] info;
	private Set<String> types;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public List<String> getModels() {
		return models;
	}

	public void setModels(List<String> models) {
		this.models = models;
	}

	public String[] getInfo() {
		return info;
	}

	public void setInfo(String[] info) {
		this.info = info;
	}

	public Set<String> getTypes() {
		return types;
	}

	public void setTypes(Set<String> types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "YamlOneDCollectionRunner [models=" + models + ", info=" + Arrays.toString(info) + ", types=" + types
				+ "]";
	}
	
	

}
