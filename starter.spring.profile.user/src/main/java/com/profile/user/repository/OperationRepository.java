package com.profile.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profile.user.entity.OperationEntity;

@Repository
public interface OperationRepository extends JpaRepository<OperationEntity, Integer> {

}
