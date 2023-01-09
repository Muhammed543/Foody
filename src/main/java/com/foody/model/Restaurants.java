package com.foody.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_details")
public class Restaurants {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long rid;
	private String restaurant_name;
	private String Location;
	private long ph_no;
	private String email;
	private String password;
	
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
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
		return "Restaurants [rid=" + rid + ", restaurant_name=" + restaurant_name + ", Location=" + Location
				+ ", ph_no=" + ph_no + ", email=" + email + ", password=" + password + "]";
	}
	
}
