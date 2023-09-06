package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Facility;
import com.web.repository.FacilityRepository;

@Service
public class FacilityServiceImp implements FacilityService
{
	@Autowired
	private FacilityRepository frepo;

	@Override
	public Facility insertD(Facility fac) {
	
		return frepo.save(fac);
	}

	@Override
	public Optional<Facility> retrievD(Long id) {
		
		return frepo.findById(id);
	}

	@Override
	public List<Facility> retrieveAll() {
	
		return frepo.findAll();
	}

	@Override
	public Facility updateD(Facility faci) {
		
		return frepo.save(faci);
	}

	@Override
	public void deleteFacility(Long id) {
		frepo.deleteById(id);
		
	}


}
