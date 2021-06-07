package com.profile.user.iservice;

import java.util.List;

import com.profile.user.dto.UserProfileDto;

public interface IserviceProfileUser {
	
	public abstract String createProfileUser(UserProfileDto userP);
	public List<UserProfileDto> getAll();
	public String update(UserProfileDto userP);
	public UserProfileDto getById(int id);
	public String delete(int id);
}
