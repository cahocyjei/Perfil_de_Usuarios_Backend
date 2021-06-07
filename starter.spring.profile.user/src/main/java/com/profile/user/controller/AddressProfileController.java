package com.profile.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.user.dto.UserAddressDto;

@RestController
@RequestMapping("/userAddress")
public class AddressProfileController {
	
	
	@PostMapping("/add")
	public UserAddressDto createAddress(@RequestBody UserAddressDto userAM) {		
		return null;
	}

}
