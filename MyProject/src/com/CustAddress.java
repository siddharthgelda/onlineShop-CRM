package com;

import java.util.Set;

public class CustAddress {
private int Cust_Address_id;
private String Add_line1;
private String Add_line2;
private String pin_code;
private Set<Orders> orders;
private Set<Country> country;
private Set<State> state;
private Set<City> city;
public CustAddress() {}
public CustAddress(int cust_Address_id, String add_line1, String add_line2, String pin_code, Set<Orders> orders,
		Set<Country> country, Set<State> state, Set<City> city) {
	super();
	Cust_Address_id = cust_Address_id;
	Add_line1 = add_line1;
	Add_line2 = add_line2;
	this.pin_code = pin_code;
	this.orders = orders;
	this.country = country;
	this.state = state;
	this.city = city;
}
public int getCust_Address_id() {
	return Cust_Address_id;
}
public void setCust_Address_id(int cust_Address_id) {
	Cust_Address_id = cust_Address_id;
}
public String getAdd_line1() {
	return Add_line1;
}
public void setAdd_line1(String add_line1) {
	Add_line1 = add_line1;
}
public String getAdd_line2() {
	return Add_line2;
}
public void setAdd_line2(String add_line2) {
	Add_line2 = add_line2;
}
public String getPin_code() {
	return pin_code;
}
public void setPin_code(String pin_code) {
	this.pin_code = pin_code;
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
public Set<State> getState() {
	return state;
}
public void setState(Set<State> state) {
	this.state = state;
}
public Set<City> getCity() {
	return city;
}
public void setCity(Set<City> city) {
	this.city = city;
}



}
