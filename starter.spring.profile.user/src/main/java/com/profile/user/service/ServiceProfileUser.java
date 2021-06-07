package com.profile.user.service;

import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.user.dto.UserProfileDto;
import com.profile.user.entity.UserProfileEntity;
import com.profile.user.iservice.IserviceProfileUser;
import com.profile.user.repository.UserProfileRepository;

@Service
public class ServiceProfileUser implements IserviceProfileUser {
	
	@Autowired
	private UserProfileRepository userProfileRepo;

	@Override
	public String createProfileUser(UserProfileDto userPM) {
		// TODO Auto-generated method stub
		if(userPM != null) {
		UserProfileEntity pUserTosaved = UserProfileDto.userPDtoToUserPEntity(userPM);
		UserProfileEntity pUserSaved = (UserProfileEntity) userProfileRepo.save(pUserTosaved);
		return "Usuario Insertado Con Exito";
		}
		
		return "Error en los Datos del Usuario";
	}

	@Override
	public List<UserProfileDto> getAll() {
		// TODO Auto-generated method stub
		List<UserProfileEntity> listUPE = userProfileRepo.findAll();
		List<UserProfileDto> listUPM = UserProfileDto.listUPEtolistUPD(listUPE);
	
		return listUPM;
	}

	@Override
	public String update(UserProfileDto userPD) {
		// TODO Auto-generated method stub
		UserProfileEntity userPE = UserProfileDto.userPDtoToUserPEntity(userPD);
		if(userProfileRepo.existsById(userPE.getId())) {
			userProfileRepo.save(userPE);
			return "Usuario Actualizado Con Exito";
		}
		return "Usuario No Existe";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		if(userProfileRepo.existsById(id)) {
			userProfileRepo.deleteById(id);
			return "Usuario Eliminado Correctamente";
		}
		return "Usuario no Existe";
	}

	@Override
	public UserProfileDto getById(int id) {
		// TODO Auto-generated method stub
		if(userProfileRepo.existsById(id)) {
			UserProfileEntity userPE = userProfileRepo.getById(id);
			UserProfileDto userPD = UserProfileDto.userPEntityToUserPDto(userPE);
			return userPD;
		}
		
		return null;
		
	}

}
