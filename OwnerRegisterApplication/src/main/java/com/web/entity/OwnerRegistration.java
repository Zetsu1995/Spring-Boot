package com.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="Register_owner")
public class OwnerRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;
	private String lastName;
	private Long phno;
	private String email;
	private String gender;
	private int age;
	private String street;
	private String city;
	private String pincode;
	private String pwd;
	@Transient
	private String confPwd;
	public OwnerRegistration() {
		super();
		
	}
	public OwnerRegistration(Integer id, String firstName, String lastName, Long phno, String email, String gender, int age,
			String street, String city, String pincode, String pwd, String confPwd) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phno = phno;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.pwd = pwd;
		this.confPwd = confPwd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getConfPwd() {
		return confPwd;
	}
	public void setConfPwd(String confPwd) {
		this.confPwd = confPwd;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phno=" + phno
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + ", pwd=" + pwd + ", confPwd=" + confPwd + "]";
	}
}
