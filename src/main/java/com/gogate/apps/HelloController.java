package com.gogate.apps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	UserService userService;
	
	@GetMapping ("/test")
	public List<User> hello(){
/*		User u1 = new User();
		u1.setId(1L);
		u1.setFirst("gaurav");
		u1.setLast("Gogate");
		u1.setEmail("abc@def.com");
		return u1;*/
		return userService.getUsers();
	}
	
	
}
