package com.example.prueba.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prueba.models.UserModel;
import com.example.prueba.service.UserService;

@Service("userserviceimp1")
public class segundaServiceIMp  implements UserService{

	@Override
	public List<UserModel> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel registrar(UserModel us) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> listartodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String name) {
		// TODO Auto-generated method stub
		
	}

}
