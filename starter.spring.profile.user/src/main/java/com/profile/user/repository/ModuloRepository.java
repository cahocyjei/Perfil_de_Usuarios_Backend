package com.profile.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profile.user.entity.ModuloEntity;

@Repository
public interface ModuloRepository extends JpaRepository<ModuloEntity, Integer> {

}
