package com.example.prueba.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.entity.UserEntity;
import com.example.prueba.models.UserModel;
@Repository("userrepository")
public interface UserRepository extends JpaRepository<UserEntity, Serializable>{
	public abstract UserEntity findBynombre(String name);
	
	

}
