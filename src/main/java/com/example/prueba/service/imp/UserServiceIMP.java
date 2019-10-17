package com.example.prueba.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.prueba.component.UserConverterComp;
import com.example.prueba.entity.UserEntity;
import com.example.prueba.models.UserModel;
import com.example.prueba.repository.UserRepository;
import com.example.prueba.service.UserService;

@Service("userserviceimp")
public class UserServiceIMP implements UserService{

	@Autowired
	@Qualifier("usercomponenet")
	private UserConverterComp UserConverterComp;
	@Autowired
	@Qualifier("userrepository")
	private UserRepository UserRepository;
	@Override
	public List<UserModel> findall() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findByname(String name) {
		
		UserEntity userent= UserRepository.findBynombre(name);
		UserModel usemod=UserConverterComp.convertir2(userent);
		
		return usemod;
		
	}

	@Override
	public UserModel registrar(UserModel us) {
		
		UserEntity user= UserRepository.save(UserConverterComp.convertir(us));
		

		return UserConverterComp.convertir2(user);
	}

	@Override
	public List<UserModel> listartodos() {
		
		
		List<UserEntity> listausuarios = UserRepository.findAll();
		List<UserModel> listmoduser= new ArrayList<>();
		for(UserEntity userent : listausuarios)
		{
			listmoduser.add(UserConverterComp.convertir2(userent)) ;
			
		}
		
		

		return listmoduser;
	}

	@Override
	public void eliminar(String name) {
	
		UserRepository.delete(UserConverterComp.convertir(findByname(name)));
		
	}

}
