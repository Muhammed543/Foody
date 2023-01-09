package com.foody.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_login")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long aid;
private String email;
private String password;
public long getAid() {
	return aid;
}
public void setAid(long aid) {
	this.aid = aid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Admin [aid=" + aid + ", email=" + email + ", password=" + password + "]";
}

}
