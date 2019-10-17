package com.example.prueba.component;

import org.springframework.stereotype.Component;

import com.example.prueba.entity.UserEntity;
import com.example.prueba.models.UserModel;

@Component("usercomponenet")
public class UserConverterComp {
	
	//convertir model a entiti
	public UserEntity convertir(UserModel usermod)
	{
		UserEntity userent = new UserEntity();
		userent.setApellido(usermod.getApellido());
		userent.setNombre(usermod.getNombre());
		userent.setPassword(usermod.getPassword());
		userent.setRole(usermod.getRole());
		userent.setTelefono(usermod.getTelefono());
		return userent;
	}
	//convertir entity a model
	public UserModel convertir2(UserEntity userent)
	{
		UserModel usermod = new UserModel();
		usermod.setApellido(userent.getApellido());
		usermod.setNombre(userent.getNombre());
		usermod.setPassword(userent.getPassword());
		usermod.setRole(userent.getRole());
		usermod.setTelefono(userent.getTelefono());
		return usermod ;
	}
}
