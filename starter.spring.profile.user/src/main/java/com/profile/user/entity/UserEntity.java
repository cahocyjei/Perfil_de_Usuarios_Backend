package com.profile.user.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
@PrimaryKeyJoinColumn(referencedColumnName="id_user")
public class UserEntity extends UserProfileEntity {

	
	@Column(name = "user_rol")
	private String userRol;

	
	
	public UserEntity(String firstName, String middleName, String lastName, String userRol) {
		super(firstName, middleName, lastName);
		this.userRol = userRol;
	}


	public UserEntity() {
		
	}


	public String getUserRol() {
		return userRol;
	}


	public void setUserRol(String userRol) {
		this.userRol = userRol;
	}


}
