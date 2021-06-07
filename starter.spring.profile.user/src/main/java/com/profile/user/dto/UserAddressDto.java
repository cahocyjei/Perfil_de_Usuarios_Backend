package com.profile.user.dto;

import java.util.List;

import com.profile.user.entity.UserAddressEntity;
import com.profile.user.entity.UserProfileEntity;

public class UserAddressDto {
	
	
	private int id;
	private String address;
	
	public UserAddressDto(int id, String address) {
		
		this.id = id;
		this.address = address;
	}
	

	public UserAddressDto() {
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public static List<UserAddressDto> listUAEtolistUAD(List<UserAddressEntity> listUAE){
			
		return null;
	}
	

	public static UserAddressEntity userADtoToUserAEntity(UserAddressDto userAD) {
		return null;
	}
	

	public static UserAddressDto userAEntityToUserADto(UserAddressEntity userAE) {
		return null;
	}

}
