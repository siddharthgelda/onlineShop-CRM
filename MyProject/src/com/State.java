package com;
import java.util.Set;



public class State {
private int State_id;
private String StateName;
private Set<City> cities;
private Set<CustAddress> address;
public State() {
	// TODO Auto-generated constructor stub
}
public int getState_id() {
	return State_id;
}
public void setState_id(int state_id) {
	State_id = state_id;
}
public String getStateName() {
	return StateName;
}
public void setStateName(String stateName) {
	StateName = stateName;
}
public Set<City> getCities() {
	return cities;
}
public void setCities(Set<City> cities) {
	this.cities = cities;
}
public Set<CustAddress> getAddress() {
	return address;
}
public void setAddress(Set<CustAddress> address) {
	this.address = address;
}
public State(int state_id, String stateName, Set<City> cities, Set<CustAddress> address) {
	super();
	State_id = state_id;
	StateName = stateName;
	this.cities = cities;
	this.address = address;
}





}
