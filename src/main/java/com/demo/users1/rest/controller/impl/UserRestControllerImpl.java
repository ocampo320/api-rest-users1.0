package com.demo.users1.rest.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.users1.rest.controller.UserRestController;



@RestController
@RequestMapping("/api/v1/users/")
public class UserRestControllerImpl implements UserRestController {

	@Override
	public ResponseEntity findAll() {
		System.out.println("findAll");
		return ResponseEntity.ok("hola , estamos buscando todos lo regisrrols de la tabla usuarios");
	}
	
	

}
