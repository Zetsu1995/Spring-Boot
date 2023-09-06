package com.web.service;

import java.util.List;
import java.util.Optional;

import com.web.binding.ForgetPassword;
import com.web.binding.Loging;
import com.web.entity.OwnerRegistration;

public interface OwnerRegistrationService 
{

	OwnerRegistration insert(OwnerRegistration ore);

	Optional<OwnerRegistration> retrive(Integer id);

	List<OwnerRegistration> retriveAll();

	OwnerRegistration updateD(OwnerRegistration org);

	String deleteD(Integer id);

	String login(Loging log);

	String forget(ForgetPassword pwd);
	
}
