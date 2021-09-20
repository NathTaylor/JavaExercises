package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {

	    System.out.println("=============Banker=============");

		Banker bankerOne = new Banker("Edmund", 38, 625000, "train");

		bankerOne.sleep();
		bankerOne.eat();
		bankerOne.does();
		System.out.println(bankerOne.toString());

		System.out.println("=============================");
		System.out.println("============Person===========");
		Person personOne = new Banker("Melchett", 40, 70000, "I don't commute");
		((Banker) personOne).does();
		personOne.sleep();
        System.out.println(personOne.toString());
        
        
		System.out.println("=============================");
		System.out.println("============Object===========");
		Object objectOne = new Banker("George", 32, 60000, "Bicycle");
		((Banker) objectOne).does();
		((Banker) objectOne).sleep();
		System.out.println(objectOne.toString());
		
		System.out.println("=============================");
		System.out.println("=============Farmer=============");

		Farmer farmerOne = new Farmer("Baldrick", 35, 325000, "tractor");

		farmerOne.sleep();
		farmerOne.eat();
		farmerOne.does();
		System.out.println(farmerOne.toString());

		System.out.println("=============================");
		System.out.println("============Person===========");
		Person personTwo = new Farmer("Percy", 42, 35000, "Defender");
		((Farmer) personTwo).does();
		personTwo.does();
		System.out.println(personTwo.toString());

		System.out.println("=============================");
		System.out.println("============Object===========");
		Object objectTwo = new Farmer("Bob", 37, 34000, "Combine Harvester");
		((Farmer) objectTwo).does();
		((Farmer) objectTwo).eat();
		System.out.println(objectTwo.toString());

	}
}
