package com.dakr.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dakr.binding.ForgetPassword;
import com.dakr.binding.Loging;
import com.dakr.entity.Registration;
import com.dakr.repository.RegistationRepository;

@Service
public class RegistrationServiceImp implements RegistrationService {
	@Autowired
	private final RegistationRepository repo;

	public RegistrationServiceImp(RegistationRepository repo) {
		super();
		this.repo = repo;
	}

	public Registration insert(Registration re) {
		return repo.save(re);
	}

	@Override
	public Optional<Registration> retrive(Integer id) {

		return repo.findById(id);
	}

	@Override
	public List<Registration> retriveAll() {

		return repo.findAll();
	}

	public Registration updateD(Registration re) {
		return repo.save(re);
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

	// for login

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

//forget password

	@Override
	public String forgetPwd(ForgetPassword pwd) {
		String temp = "";
		Registration reg = new Registration();
		
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
