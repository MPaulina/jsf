package com.example.jsfdemo.domain;

public class Alcohol {
	private String type; //jaki alkohol
	private String name; //nazwa marki
	private int quantun; //ilosc
	private double capacity; //pojemnosc
	private boolean isProcentFree = false; //standardowo jest false, wiec nie trzeba tego
	
	public Alcohol() {
	}

	public Alcohol(String type, String name, int quantun, double capacity,
			boolean isProcentFree) {
		super();
		this.type = type;
		this.name = name;
		this.quantun = quantun;
		this.capacity = capacity;
		this.isProcentFree = isProcentFree;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantun() {
		return quantun;
	}

	public void setQuantun(int quantun) {
		this.quantun = quantun;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean isProcentFree() {
		return isProcentFree;
	}

	public void setProcentFree(boolean isProcentFree) {
		this.isProcentFree = isProcentFree;
	}
}
