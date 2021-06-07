package com.profile.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profile.user.entity.UserAddressEntity;

@Repository
public interface AddressProfileRepository extends JpaRepository<UserAddressEntity, Integer> {

}
