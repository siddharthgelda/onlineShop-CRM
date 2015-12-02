package com;

import java.util.Set;

public class City {
private int city_id;
public int getCity_id() {
	return city_id;
}
public void setCity_id(int city_id) {
	this.city_id = city_id;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public Set<CustAddress> getAddress() {
	return address;
}
public void setAddress(Set<CustAddress> address) {
	this.address = address;
}
private String cityName;
private Set<CustAddress> address;
public City() {
	// TODO Auto-generated constructor stub
}



}
