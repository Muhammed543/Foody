package com.foody.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_details")

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private long uid;
	private String name;
	private String location;
	private long mob_no;
	private String email;
	private String password;
	
	
	public long getUid() {
		return uid;
	}


	public void setUid(long uid) {
		this.uid = uid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public long getMob_no() {
		return mob_no;
	}


	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
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
		return "User [uid=" + uid + ", name=" + name + ", location=" + location + ", mob_no=" + mob_no + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	



}
