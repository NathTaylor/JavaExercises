package com.qa.classes;

public class Runner {

	public static void main(String[] args) {

    Person nate = new Person("Nathan", "Taylor", 9.0, 29, 5.10, "Student");
    Person jax = new Person("Jax", "Taylor", 0.8, 1, 1, "Baby");
    Person grant = new Person("Grant", "Legend", 9.0, 25, 5.09, "Principal Engineer");
    Person tate = new Person("Benny", "Tatendaya", 9.0, 25, 5.06, "Rapper");
   
    nate.whoAreYou();
    jax.whoAreYou();
    grant.whoAreYou();
    tate.whoAreYou();
	
	}
}