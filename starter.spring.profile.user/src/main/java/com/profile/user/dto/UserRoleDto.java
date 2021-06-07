package com.profile.user.dto;

public class UserRoleDto {

	private int idUser;
	private String roleType;
	private int idEntity;
	private int status;
	
	public UserRoleDto(int idUser, String roleType, int idEntity, int status) {
		this.idUser = idUser;
		this.roleType = roleType;
		this.idEntity = idEntity;
		this.status = status;
	}

	public UserRoleDto() {
		
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public int getIdEntity() {
		return idEntity;
	}

	public void setIdEntity(int idEntity) {
		this.idEntity = idEntity;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
