package com.profile.user.dto;

import java.util.LinkedList;
import java.util.List;

import com.profile.user.entity.ModuloEntity;
import com.profile.user.entity.OperationEntity;

public class OperationDto {

	private int id;
	
	private String name;
	
	private String moduloName;
	
	
	public OperationDto(String name) {
		
		this.name = name;
	}

	public OperationDto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModuloName() {
		return moduloName;
	}

	public void setModuloName(String moduloName) {
		this.moduloName = moduloName;
	}

	public static List<OperationEntity> opeDtoToOpeEntity(OperationDto opeD) {
		OperationEntity opeE = new OperationEntity();
		opeE.setName(opeD.getName());
		opeE.setModuloEntity(new ModuloEntity(opeD.getModuloName()));
		
		List<OperationEntity> listOpeE = new LinkedList< OperationEntity>();
		listOpeE.add(opeE);
		
		return listOpeE;
	}
}
