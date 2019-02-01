package com.kiran.contactapp.command;

import javax.validation.Valid;

import com.kiran.contactapp.domain.User;

public class UserCommand {

	@Valid
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
