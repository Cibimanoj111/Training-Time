package com.day4.constructor;

public class Customer {
	private String customerName;
	private String customerCity;
	private String customerId;
	
	public Customer() {
	
		
	}
	public Customer(String customerName, String customerCity, String customerId) {
		super();
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
	
	

}
