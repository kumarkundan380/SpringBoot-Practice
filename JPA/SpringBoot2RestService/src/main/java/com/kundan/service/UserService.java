package com.kundan.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kundan.model.User;

@Component
public class UserService {
	
	private static List<User> users = new ArrayList<>();

	private static int userCount = 3;
	static {
		users.add(new User(1,"Kundan",new Date()));
		users.add(new User(2,"Deepak",new Date()));
		users.add(new User(3,"Rajendra",new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User saveUser) {
		if(saveUser.getId()==null) {
			saveUser.setId(++userCount);
		}
		users.add(saveUser);
		return saveUser;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
}
