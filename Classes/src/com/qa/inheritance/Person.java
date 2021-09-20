package com.qa.inheritance;

public class Person {

	private String name;
	private int age;
	private int earns;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public int getEarns() {
		return earns;
	}

	public void setEarns(int earns) {
		this.earns = earns;
	}

	public void eat() {
		System.out.println("I paid a lot of p's for this, mmmm tasty");
	}

	public void sleep() {
		System.out.println("After a hard days work, I'll sleep like a log");
	}

	public void does() {
		System.out.println("I do my job");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", earns=" + earns + "]";
	}
	
	
}
