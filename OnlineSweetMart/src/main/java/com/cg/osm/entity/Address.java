package com.cg.osm.entity;

import javax.validation.constraints.NotNull;

public class Address {
	@NotNull(message = "City name cannot be null")
	private String city;
	@NotNull(message = "Contact Number cannot be null")
	private String contactNo;
	@NotNull(message = "zip should not be empty")
	private String zip;
	
	public Address() {
	}

	public Address(@NotNull(message = "City name cannot be null") String city,
			@NotNull(message = "Contact Number cannot be null") String contactNo,
			@NotNull(message = "zip should not be empty") String zip) {
		super();
		this.city = city;
		this.contactNo = contactNo;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getcontactNo() {
		return contactNo;
	}

	public void setcontactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getzip() {
		return zip;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", contactNo=" + contactNo + ", zip=" + zip + "]";
	}

}// closing class