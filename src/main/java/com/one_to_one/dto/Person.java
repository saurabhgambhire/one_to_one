package com.one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private long mobile;
	@OneToOne( fetch = FetchType.LAZY)
	private AdharCard adharCard;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getMobile() {
		return mobile;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + ", adharCard=" + adharCard + "]";
//	}

}
