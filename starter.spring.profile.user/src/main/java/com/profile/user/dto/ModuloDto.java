package com.profile.user.dto;

import com.profile.user.entity.ModuloEntity;

public class ModuloDto {
	
	private int id;
	private String moduloName;
	
	public ModuloDto() {
		
	}
	

	public ModuloDto(String moduloName) {
		
		this.moduloName = moduloName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getModuloName() {
		return moduloName;
	}

	public void setModuloName(String moduloName) {
		this.moduloName = moduloName;
	}

	public static ModuloEntity moduloDtoToModuloEntity(ModuloDto moduloD) {
		ModuloEntity moduloE = new ModuloEntity();
		moduloE.setModuloName(moduloD.getModuloName());
		
		return moduloE;
	}
}
