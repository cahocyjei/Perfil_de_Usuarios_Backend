package com.profile.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.user.dto.OperationDto;
import com.profile.user.service.ServiceOperation;

@RestController
@RequestMapping("/operation")
public class OperationController {
	
	@Autowired
	ServiceOperation serviceOperation;

	@PostMapping("/add")
	public String addOperation(@RequestBody OperationDto opeD) {
		
		return serviceOperation.addOperation(opeD);
	}
	
	
}
