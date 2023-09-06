package com.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.OwnerRegistration;

@Repository
public interface OwnerRegistrationRepository extends JpaRepository<OwnerRegistration, Integer> {

	Optional<OwnerRegistration> findByPwd(String pwd);

	Optional<OwnerRegistration> findByEmail(String email);

	Optional<OwnerRegistration> findByPhno(Long phno);

	
}
