package com.dakr.service;

import java.util.List;
import java.util.Optional;
import com.dakr.binding.ForgetPassword;
import com.dakr.binding.Loging;
import com.dakr.entity.Registration;


public interface RegistrationService {

    public Registration insert(Registration re);

    public Optional<Registration> retrive(Integer id);

	public List<Registration> retriveAll();

	public Registration updateD(Registration reg);

	public String deleteD(Integer id);
	
	public String login(Loging log);

	public String forgetPwd(ForgetPassword pwd);

	

}
