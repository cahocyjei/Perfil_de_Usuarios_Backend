package com.profile.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.user.dto.UserDto;
import com.profile.user.entity.UserEntity;
import com.profile.user.iservice.IserviceUser;
import com.profile.user.repository.UserRepository;

@Service
public class ServiceUser implements IserviceUser {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public String createUser(UserDto userDt) {
		// TODO Auto-generated method stub
		if(userDt != null) {
			UserEntity userTosaved = UserDto.userDtoToUserEntity(userDt);
			UserEntity userSaved = userRepo.save(userTosaved);
			return "Usuario Creado con Exito";
		}
		return "Error al Crear Usuario";
	}
	


}
