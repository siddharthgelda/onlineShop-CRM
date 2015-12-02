package com;

import java.util.Set;

public class Country {
private int Country_id;
private String Country_name;
private Set<CustAddress> address;
private Set<State> states;

public Country(int country_id, String country_name, Set<CustAddress> address, Set<State> states) {
	super();
	Country_id = country_id;
	Country_name = country_name;
	this.address = address;
	this.states = states;
}

public int getCountry_id() {
	return Country_id;
}

public void setCountry_id(int country_id) {
	Country_id = country_id;
}

public String getCountry_name() {
	return Country_name;
}

public void setCountry_name(String country_name) {
	Country_name = country_name;
}

public Set<CustAddress> getAddress() {
	return address;
}

public void setAddress(Set<CustAddress> address) {
	this.address = address;
}

public Set<State> getStates() {
	return states;
}

public void setStates(Set<State> states) {
	this.states = states;
}

public Country() {}


}
