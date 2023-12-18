package com.CURDOperations.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PassportEntity {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int passportNumber;
	private String name;
	private String area;
	public PassportEntity(int passportNumber, String name, String area) {
		super();
		this.passportNumber = passportNumber;
		this.name = name;
		this.area = area;
	}
	public PassportEntity() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PassportEntity [passportNumber=" + passportNumber + ", name=" + name + ", area=" + area + "]";
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
