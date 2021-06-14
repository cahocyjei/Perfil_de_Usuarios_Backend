package com.profile.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.user.dto.ModuloDto;
import com.profile.user.entity.ModuloEntity;
import com.profile.user.iservice.IServiceModulo;
import com.profile.user.repository.ModuloRepository;

@Service
public class ServiceModulo implements IServiceModulo {

	@Autowired
	private ModuloRepository moduloRepo;
	
	@Override
	public String addModulo(ModuloDto moduloD) {
		// TODO Auto-generated method stub
		if(moduloD != null) {
			ModuloEntity toSaved = ModuloDto.moduloDtoToModuloEntity(moduloD);
			ModuloEntity saved = moduloRepo.save(toSaved);
			return "Modulo Insertado con Exito";
		}
		return "Error al Insertar el Modulo";
	}

}
