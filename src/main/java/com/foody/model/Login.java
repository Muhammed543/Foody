package com.foody.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login_details")
public class Login {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long logid;
private String email;
private String password;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="uid",referencedColumnName="uid")
private User user;


public long getLogid() {
	return logid;
}


public void setLogid(long logid) {
	this.logid = logid;
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


public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


@Override
public String toString() {
	return "Login [logid=" + logid + ", Email=" + email + ", password=" + password + "]";
}



}
