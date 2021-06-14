package com.profile.user.dto;

import java.util.Date;

import com.profile.user.entity.UserEntity;
import com.profile.user.entity.UserProfileEntity;

public class UserDto extends UserProfileEntity {
	
	
	private int id;
	private String userRol;
	

	public UserDto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUserRol() {
		return userRol;
	}


	public void setUserRol(String userRol) {
		this.userRol = userRol;
	}

	public static UserEntity userDtoToUserEntity(UserDto userDt) {
		UserEntity userE = new UserEntity();
		userE.setFirstName(userDt.getFirstName());
		userE.setMiddleName(userDt.getMiddleName());
		userE.setLastName(userDt.getLastName());
		userE.setAddress(userDt.getAddress());
		userE.setUserRol(userDt.getUserRol());
		userE.setCreateDate(new Date());
		
		return userE;
	}

}