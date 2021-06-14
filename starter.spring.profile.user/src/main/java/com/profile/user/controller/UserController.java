package com.profile.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.user.dto.UserDto;
import com.profile.user.service.ServiceUser;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private ServiceUser serviceUser;
	
	@PostMapping("/add")
	public String createUser(@RequestBody UserDto userDt) {		
		return serviceUser.createUser(userDt);
	}

}
