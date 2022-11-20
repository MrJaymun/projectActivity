package com.ProjectActivity.importerSite.Dto;

import com.ProjectActivity.importerSite.Entity.User;

public class UserDto {

	public UserDto(User user) {
		this.login = user.getLogin();
		this.password = user.getPassword();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String login;
	private String password;
}
