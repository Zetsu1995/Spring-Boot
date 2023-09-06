package com.dakr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="FORGET_PASSWORD_TBL")
public class Forget_Password {

	private String email;
	private Long phno;
	private String newPwd;
	private String confPwd;
	
	
}
