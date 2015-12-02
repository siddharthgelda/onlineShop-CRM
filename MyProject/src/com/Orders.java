package com;

import java.util.Set;

public class Orders {
private int Order_id;
private String order_price;
private String order_date;
private String delivery_date;
private String discount;
private String coupon;
private String product_name;
private String order_no;
private Set<Customer> customer;
public int getOrder_id() {
	return Order_id;
}

public void setOrder_id(int order_id) {
	Order_id = order_id;
}

public String getOrder_price() {
	return order_price;
}

public void setOrder_price(String order_price) {
	this.order_price = order_price;
}

public String getOrder_date() {
	return order_date;
}

public void setOrder_date(String order_date) {
	this.order_date = order_date;
}

public String getDelivery_date() {
	return delivery_date;
}

public void setDelivery_date(String delivery_date) {
	this.delivery_date = delivery_date;
}

public String getDiscount() {
	return discount;
}

public void setDiscount(String discount) {
	this.discount = discount;
}

public String getCoupon() {
	return coupon;
}

public void setCoupon(String coupon) {
	this.coupon = coupon;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public String getOrder_no() {
	return order_no;
}

public void setOrder_no(String order_no) {
	this.order_no = order_no;
}

public Set<Customer> getCustomer() {
	return customer;
}

public void setCustomer(Set<Customer> customer) {
	this.customer = customer;
}

public Set<CustAddress> getAddress() {
	return address;
}

public void setAddress(Set<CustAddress> address) {
	this.address = address;
}

private Set<CustAddress> address;

public  Orders() {}

public Orders(int order_id, String order_price, String order_date, String delivery_date, String discount, String coupon,
		String product_name, String order_no, Set<Customer> customer, Set<CustAddress> address) {
	super();
	Order_id = order_id;
	this.order_price = order_price;
	this.order_date = order_date;
	this.delivery_date = delivery_date;
	this.discount = discount;
	this.coupon = coupon;
	this.product_name = product_name;
	this.order_no = order_no;
	this.customer = customer;
	this.address = address;
}


}
