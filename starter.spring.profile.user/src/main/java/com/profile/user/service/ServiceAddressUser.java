package com.profile.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.user.dto.UserAddressDto;
import com.profile.user.entity.UserAddressEntity;
import com.profile.user.iservice.IserviceAddressUser;
import com.profile.user.repository.AddressProfileRepository;

@Service
public class ServiceAddressUser implements IserviceAddressUser {
	

	@Override
	public UserAddressDto createAddress(UserAddressDto userAD) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<UserAddressDto> getAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
