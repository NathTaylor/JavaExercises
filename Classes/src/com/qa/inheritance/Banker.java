package com.qa.inheritance;

public class Banker extends Person {
    
	private String commutes;
	
	public Banker (String name, int age, int earns, String commutes) {
		this.setName(name);
		this.setAge(age);
		this.setEarns(earns);
		this.commutes = commutes;
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeping on a bed of money Baby");
	}
	
	public void does() {
		System.out.println("Counting the monies");
	}

	@Override
	public String toString() {
		return "Banker [getName() = " + getName() + ", getAge() = " + getAge() + ", getEarns() = "
				+ getEarns() + ", commutes = " + commutes +  "]";
	}

	
	
}