package com.app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {

	
	private int hono;
	
	@Column(name="location")
	private String area;

	public Address() {
	}

	public int getHono() {
		return hono;
	}

	public void setHono(int hono) {
		this.hono = hono;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [hono=" + hono + ", area=" + area + "]";
	}

}
