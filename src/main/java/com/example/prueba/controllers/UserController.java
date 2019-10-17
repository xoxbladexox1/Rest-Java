package com.example.prueba.controllers;




import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.example.prueba.models.UserModel;
import com.example.prueba.service.UserService;


@RestController
@RequestMapping("/restprueba")
@Api(value = "user service")
public class UserController {
	
	@Autowired
	@Qualifier("userserviceimp")
	private UserService UserService;
	
	
	@Autowired
	@Qualifier("userserviceimp1")
	private UserService UserService1;
	
	//mostrartodos
	
	@ApiResponses(value = {@ApiResponse(code = 0000 ,message = " el metodo mostrar todos se dio con exito")})
	@GetMapping(path = "/mostrartodos" )
	public   ResponseEntity<List<UserModel>>   mostrartodos(){
		
		List<UserModel> userlist= new ArrayList<>();
		userlist=UserService.listartodos();
		return new ResponseEntity<List<UserModel>>(userlist,HttpStatus.OK) ;
	}
	
	@ApiOperation( value = "obtinfo" ,nickname = "obtinfo")
	@ApiResponses(value = {@ApiResponse(code = 0000 ,message = "el metodo buscarpesona se dio con exito")})
	@GetMapping(path="/buscarpersona")
	public ResponseEntity<UserModel>  obtinfo(@RequestParam(name = "nombre") String yahorasi, HttpServletRequest x)
	{
		UserModel usermod = new UserModel();
		usermod= UserService.findByname(yahorasi);
		
		
		return new ResponseEntity<UserModel>(usermod,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	@ApiResponses(value = {@ApiResponse(code = 0000 ,message = " el metodo registrar se dio con exito")})
	@PostMapping(path = "/agregarper")
	
	public ResponseEntity<UserModel>  registrar(@RequestBody UserModel usermodl)
	{
		UserModel usermod = new UserModel();
		usermod = UserService.registrar(usermodl);
		return new ResponseEntity<UserModel>(usermod,HttpStatus.OK) ;
		
	}
	
	@DeleteMapping(path = "/borraruser/{name}")
	public void eliminaruser(@PathVariable (name = "name") String num)
	{
		UserService.eliminar(num);
		return ;
	}

}
