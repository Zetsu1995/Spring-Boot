package com.web.service;

import java.util.List;
import java.util.Optional;

import com.web.entity.Facility;

public interface FacilityService {

	Facility insertD(Facility fac);

	Optional<Facility> retrievD(Long id);

	List<Facility> retrieveAll();

	Facility updateD(Facility faci);

	void deleteFacility(Long id);



}
