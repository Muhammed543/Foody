package com.foody.model;

public class UserRegData {
	private User user;
	private Login login;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "UserRegData [user=" + user + ", login=" + login + "]";
	}
	
	
	
}
