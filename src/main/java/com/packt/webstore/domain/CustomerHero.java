package com.packt.webstore.domain;

import java.io.Serializable;

public class CustomerHero implements Serializable {
	
	//
	//
	
private static final long serialVersionUID = 519120743943282354L;
	
	private String customerId;
	private String name;
	private String address;
	private Long noOfOrdersMade;
	
	public CustomerHero() {}
	
	public CustomerHero(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// Getters/Setters


	public String getName() {
		return name;
	}

	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(Long noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

	@Override
	public String toString() {
		return "CustomerHero [customerId=" + customerId + ", name=" + name + ", address=" + address + ", noOfOrdersMade="
				+ noOfOrdersMade + "]";
	}
	

}

