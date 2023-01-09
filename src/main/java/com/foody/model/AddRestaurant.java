package com.foody.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="add_restaurant")
public class AddRestaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long rid;
	private String restaurant;
	private String location;
	private long ph_no;
	
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "AddRestaurant [rid=" + rid + ", restaurant=" + restaurant + ", location=" + location + ", ph_no="
				+ ph_no + "]";
	}
	
}
