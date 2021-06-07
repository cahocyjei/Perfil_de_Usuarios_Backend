package com.profile.user.dto;

import java.util.LinkedList;
import java.util.List;

import com.profile.user.entity.UserAddressEntity;
import com.profile.user.entity.UserProfileEntity;

public class UserProfileDto {

	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String address;


	public UserProfileDto(String firstName, String middleName, String lastName) {
	
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}


	public UserProfileDto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static UserProfileEntity userPDtoToUserPEntity(UserProfileDto userPD) {
		UserProfileEntity userPE = new UserProfileEntity();
		userPE.setId(userPD.getId());
		userPE.setFirstName(userPD.getFirstName());
		userPE.setMiddleName(userPD.getMiddleName());
		userPE.setLastName(userPD.getLastName());
		userPE.setUserAddress(new UserAddressEntity(userPD.getAddress()));
		
		return userPE;
	}


	public static UserProfileDto userPEntityToUserPDto(UserProfileEntity userPE) {
		UserProfileDto userPD = new UserProfileDto();
		userPD.setFirstName(userPE.getFirstName());
		userPD.setMiddleName(userPE.getMiddleName());
		userPD.setLastName(userPE.getLastName());
		userPD.setId(userPE.getId());
		userPD.setAddress(userPE.getUserAddress().getAddress());
		
		return userPD;
	}


	public static List<UserProfileDto> listUPEtolistUPD(List<UserProfileEntity> listUPE){
			
			List<UserProfileDto> listUPM = new LinkedList<UserProfileDto>();
			
			for(UserProfileEntity userPEL:listUPE) {
				listUPM.add(UserProfileDto.userPEntityToUserPDto(userPEL));
			}
		return listUPM;
	}

	
}