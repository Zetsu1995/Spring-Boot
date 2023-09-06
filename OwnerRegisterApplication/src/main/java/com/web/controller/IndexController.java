package com.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.web.binding.ForgetPassword;
import com.web.binding.Loging;
import com.web.service.OwnerRegistrationService;

public class IndexController 
{
	private final OwnerRegistrationService reser;
	
	public IndexController(OwnerRegistrationService reser)
	{
		super();
		this.reser = reser;
	}
	
	//for login
	@PostMapping("/login")
	public String login(@RequestBody Loging log)
	{
		return reser.login(log);
	}
	
	//for forget password
	@PostMapping("/foget")
	public String forgetPassword(@RequestBody ForgetPassword pwd)
	{
		return reser.forget(pwd);
	}
}
