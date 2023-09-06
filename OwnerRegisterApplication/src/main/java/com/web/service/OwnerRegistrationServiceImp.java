package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.binding.ForgetPassword;
import com.web.binding.Loging;
import com.web.entity.OwnerRegistration;
import com.web.repository.OwnerRegistrationRepository;

public class OwnerRegistrationServiceImp implements OwnerRegistrationService 
{
	private final OwnerRegistrationRepository repo;
	
	public OwnerRegistrationServiceImp(OwnerRegistrationRepository repo)
	{
		super();
		this.repo = repo;
	}
	
	public OwnerRegistration insert(OwnerRegistration re) {
		return repo.save(re);
	}

	@Override
	public Optional<OwnerRegistration> retrive(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public List<OwnerRegistration> retriveAll() {
		
		return repo.findAll();
	}

	@Override
	public OwnerRegistration updateD(OwnerRegistration org) {
		
		return repo.save(org);
	}

	@Override
	public String deleteD(Integer id) {
		
		String temp = "";
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			temp = "deleted successfully....";
		} else {
			temp = id + "is not present in the Data Base";
		}
		return temp;
	}

	@Override
	public String login(Loging log) {
		
		String temp = "";

		if ((repo.findByPhno(log.getPhno()).isPresent() || repo.findByEmail(log.getEmail()).isPresent())
				&& repo.findByPwd(log.getPwd()).isPresent()) {
			temp = "login successfully...";
		} else {
			temp = "invalid data";
		}
		return temp;
	}

	@Override
	public String forget(ForgetPassword pwd) {
		
		String temp = "";
		OwnerRegistration reg = new OwnerRegistration();
		
		//pwd.getPhno().equals(repo.findByPhno(reg.getPhno()
		//pwd.getEmail().equals(repo.findByEmail(reg.getEmail())

		if (  pwd.getPwd().equals(pwd.getConfPwd())) {
			reg.setPwd(pwd.getPwd());
			reg.setConfPwd(pwd.getConfPwd());
			repo.save(reg);

			temp = "password is updated successfully...";
		} 
		else 
		{
			temp = "invalid email/phno,Please once check.....";
		}
		return temp;
	}
	
}
