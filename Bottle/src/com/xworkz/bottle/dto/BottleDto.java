package com.xworkz.bottle.dto;

import java.io.Serializable;

public class BottleDto implements Serializable,Comparable<BottleDto>{
	
	private String bottleName;
	private String bottleColour;
	private String manufactureLocation;
	private String type;
	private String storage;
	private int price;
	private double rating;
	private int customerNumber;
	private int expireDate;
	private int manufactureDate;
	public BottleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BottleDto(String bottleName, String bottleColour, String manufactureLocation, String type, String storage,
			int price, double rating, int customerNumber, int expireDate, int manufactureDate) {
		super();
		this.bottleName = bottleName;
		this.bottleColour = bottleColour;
		this.manufactureLocation = manufactureLocation;
		this.type = type;
		this.storage = storage;
		this.price = price;
		this.rating = rating;
		this.customerNumber = customerNumber;
		this.expireDate = expireDate;
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String toString() {
		return "BottleDto [bottleName=" + bottleName + ", bottleColour=" + bottleColour + ", manufactureLocation="
				+ manufactureLocation + ", type=" + type + ", storage=" + storage + ", price=" + price + ", rating="
				+ rating + ", customerNumber=" + customerNumber + ", expireDate=" + expireDate + ", manufactureDate="
				+ manufactureDate + "]";
	}
	public String getBottleName() {
		return bottleName;
	}
	public void setBottleName(String bottleName) {
		this.bottleName = bottleName;
	}
	public String getBottleColour() {
		return bottleColour;
	}
	public void setBottleColour(String bottleColour) {
		this.bottleColour = bottleColour;
	}
	public String getManufactureLocation() {
		return manufactureLocation;
	}
	public void setManufactureLocation(String manufactureLocation) {
		this.manufactureLocation = manufactureLocation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(int expireDate) {
		this.expireDate = expireDate;
	}
	public int getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(int manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public int compareTo(BottleDto o) {
		return Integer.compare(this.expireDate, o.expireDate);
	}
	
	
	
	

}
