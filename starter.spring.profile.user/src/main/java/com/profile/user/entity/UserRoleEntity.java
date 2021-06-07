package com.profile.user.entity;

public class UserRoleEntity {

	  private int idEntity;
	  private int idUser;
	  private String roleType;
	  private int status;
	  
	public UserRoleEntity() {
		
	}

	public int getIdEntity() {
		return idEntity;
	}

	public void setIdEntity(int idEntity) {
		this.idEntity = idEntity;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	  
	  
}
