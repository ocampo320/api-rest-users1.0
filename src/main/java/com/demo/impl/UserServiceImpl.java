package com.demo.impl;

import org.springframework.stereotype.Service;

import com.demo.repository.UserRepository;
import com.demo.services.UserServices;

import antlr.collections.List;

/***
 * esta injection toma el componente y le da caracteristicas
 * @componente para diseñar compoennete
 * @repositori acceso a datos si se puede aplicar a interfaces
 * 
 * */


@Service
public class UserServiceImpl implements UserServices{
	
	private UserRepository userRepository;
	
	@Override
	public List finAll()
	{
		
		return null;
	}
	
	

}
