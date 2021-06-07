package com.profile.user.iservice;

import java.util.List;

import com.profile.user.dto.UserAddressDto;

public interface IserviceAddressUser {
	
	public abstract UserAddressDto createAddress(UserAddressDto userAM);
	public List<UserAddressDto> getAll();

}
