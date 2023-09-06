package com.dakr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.binding.ForgetPassword;
import com.dakr.binding.Loging;
import com.dakr.service.RegistrationService;

@RestController
public class IndexController {

	@Autowired
	private final RegistrationService reser;

	public IndexController(RegistrationService reser) {
		super();
		this.reser = reser;
	}
   //for login
	@PostMapping("/login")
	public String login(@RequestBody Loging log) {
		return reser.login(log);
	}

	// for forget password

	@PostMapping("/forget")
	public String forgetPassword(@RequestBody ForgetPassword pwd) {
		return reser.forgetPwd(pwd);
	}

}
