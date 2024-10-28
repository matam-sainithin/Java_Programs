package com;

import java.io.Serializable;

public class Marker implements Serializable{
	private String brand;
	private int cost;
	private String color;
	
	public Marker() {}

	public Marker(String brand, int cost, String color) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void display() {
		System.out.println("Marker brand:"+getBrand());
		System.out.println("Marker Cost:"+getCost());
		System.out.println("Marker Color:"+getColor());
	}
}
