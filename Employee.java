package com.springframework.dependencychecking.simple.applicationcontext;

/* 1. Simple :
	           If you set dependency checking to simple then it is mandatory to call primitives types setter methods.
                           Program for dependency checking using simple. */

public class Employee {

	// Declare

	private String firstName;
	private Address address; // Secondary DataType

	// Use Getter & Setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", address=" + address + "]";
	}

	// Create Method
	public void getEmployee() {

		System.out.println("First Name > " + firstName);
		System.out.println("Address > " + address.getAddressLine());

	}

}
