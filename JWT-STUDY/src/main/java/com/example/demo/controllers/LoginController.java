package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.services.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService  lservice;
	
	@PostMapping("/chklogin")
	public Login chklogin(@RequestBody  LoginCheck lcheck)
	{
		return lservice.getLogin(lcheck.getUid(),lcheck.getPwd());
	}    
}
