package com.profile.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profile.user.entity.UserProfileEntity;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileEntity,Integer>{

}
