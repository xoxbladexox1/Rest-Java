package com.example.prueba.service;

import java.util.List;


import com.example.prueba.models.UserModel;

public abstract interface UserService {
	public abstract List<UserModel> findall();
	public abstract UserModel findByname( String name) ;
	public abstract UserModel registrar(UserModel us);
	public abstract List<UserModel> listartodos();
	public abstract void eliminar(String name);

}
