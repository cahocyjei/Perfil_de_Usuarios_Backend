package com.profile.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.user.dto.OperationDto;
import com.profile.user.entity.OperationEntity;
import com.profile.user.iservice.IServiceOperation;
import com.profile.user.repository.OperationRepository;

@Service
public class ServiceOperation implements IServiceOperation {

	@Autowired
	OperationRepository operationRepo;
	@Override
	public String addOperation(OperationDto opeD) {
		// TODO Auto-generated method stub
		if(opeD != null) {
			List<OperationEntity> listTosaved = OperationDto.opeDtoToOpeEntity(opeD);
			for(OperationEntity listSaved:listTosaved) {
				operationRepo.save(listSaved);
			}
			return "Operaciones Guardadas con Exito";
		}
		return "Error al guardar las Operaciones";
	}
	
}
