package com.qa.inheritance;

public class Farmer extends Person {

	private String drives;
	
	public Farmer(String name, int age, int earns, String drives) {
		this.setName(name);
		this.setAge(age);
		this.setEarns(earns);
		this.drives = drives;
	}
	
	@Override
	public void eat() {
		System.out.println("Whats for dinner luv?");
	}
	
	public void does() {
		System.out.println("I drive my tractor");
	}

	@Override
	public String toString() {
		return "Farmer [getName() = " + getName() + ", getAge() = " + getAge() + ", getEarns( )= "
				+ getEarns() + ", drives = " + drives + "]";
	}
	
	
	
}
