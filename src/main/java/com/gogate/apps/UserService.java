package com.gogate.apps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public List<User> getUsers(){
		List<User> users = new ArrayList<>();
		User u1 = new User(1L,"GG","abc@def");
		User u2 = new User(2L,"TG","ghi@jkl");
		users.add(u1);
		users.add(u2);
		return users;
	}
}
