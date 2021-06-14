package com.profile.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.user.dto.ModuloDto;
import com.profile.user.service.ServiceModulo;

@RestController
@RequestMapping("modulo")
public class ModuloController {
	
	@Autowired
	ServiceModulo serviceModulo;
	
	@PostMapping("/add")
	public String addModulo(@RequestBody ModuloDto moduloD) {
	
		return serviceModulo.addModulo(moduloD);
	}

}
