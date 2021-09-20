package com.qa.classes;

public class Person {

	private String firstName;
	private String lastName;
	private double shoeSize;
	private int age;
	private double height;
	private String jobTitle;

	Person(String firstName, String lastName, double shoeSize, int age, double height, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.shoeSize = shoeSize;
		this.age = age;
		this.height = height;
		this.jobTitle = jobTitle;
	}

	Person(String firstName, String lastName, double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
	}

	public void whoAreYou() {
		System.out.println("I am " + firstName + " " + lastName + ", my shoe size is " + shoeSize + ", I am " + age
				+ " years old, I am " + height + " tall and I am a " + jobTitle + ".");
	}

	public static void hello() {
		System.out.println("hello");
	}
}
