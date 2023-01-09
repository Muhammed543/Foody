package com.foody.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class Items {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private long itemid;
 private String itemname;
 private long quantity;
 private long price;
 
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public long getQuantity() {
	return quantity;
}
public void setQuantity(long quantity) {
	this.quantity = quantity;
}
public long getItemid() {
	return itemid;
}
public void setItemid(long itemid) {
	this.itemid = itemid;
}
public String getItem_name() {
	return itemname;
}
public void setItem_name(String item_name) {
	this.itemname = item_name;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
@Override
public String toString() {
	return "Items [itemid=" + itemid + ", itemname=" + itemname + ", quantity=" + quantity + ", price=" + price + "]";
}

}
 
