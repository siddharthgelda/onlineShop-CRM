package com;

import java.util.Set;

public class Customer {
private int cust_id;
private String f_name;
private String l_name;
private String email;

private String passwrd;

private String DOB;
private String mob_num;
private String gender;

private String pro_pic_path;

private Set<CustAddress> address;
private Set<Orders> orders;
private Set<Country> country;

public  Customer() {
	// TODO Auto-generated constructor stub
} 
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPasswrd() {
	return passwrd;
}
public void setPasswrd(String passwrd) {
	this.passwrd = passwrd;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getMob_num() {
	return mob_num;
}
public void setMob_num(String mob_num) {
	this.mob_num = mob_num;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPro_pic_path() {
	return pro_pic_path;
}
public void setPro_pic_path(String pro_pic_path) {
	this.pro_pic_path = pro_pic_path;
}
public Set<CustAddress> getAddress() {
	return address;
}
public void setAddress(Set<CustAddress> address) {
	this.address = address;
}
public Set<Orders> getOrders() {
	return orders;
}
public void setOrders(Set<Orders> orders) {
	this.orders = orders;
}
public Set<Country> getCountry() {
	return country;
}
public void setCountry(Set<Country> country) {
	this.country = country;
}
public Customer(int cust_id, String f_name, String l_name, String email, String passwrd, String dOB, String mob_num,
		String gender, String pro_pic_path, Set<CustAddress> address, Set<Orders> orders, Set<Country> country) {
	super();
	this.cust_id = cust_id;
	this.f_name = f_name;
	this.l_name = l_name;
	this.email = email;
	this.passwrd = passwrd;
	DOB = dOB;
	this.mob_num = mob_num;
	this.gender = gender;
	this.pro_pic_path = pro_pic_path;
	this.address = address;
	this.orders = orders;
	this.country = country;
}



}
