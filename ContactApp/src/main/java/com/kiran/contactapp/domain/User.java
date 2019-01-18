package com.kiran.contactapp.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String address;
	@Column(nullable=false,unique=true)
	private String loginName;
	@Column
	private String password;
	@Column(nullable=false,columnDefinition="int default 2")
	private Integer role;
	@Column(nullable=false,columnDefinition="int default 1")
	private Integer loginStatus;
	
	@OneToMany(mappedBy="user")
	private Collection<Contact> contact = new ArrayList<Contact>();
	
	public Collection<Contact> getContact() {
		return contact;
	}
	public void setContact(Collection<Contact> contact) {
		this.contact = contact;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
	
}
