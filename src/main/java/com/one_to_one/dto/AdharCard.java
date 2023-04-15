package com.one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {
	@Id
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AdharCard [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
