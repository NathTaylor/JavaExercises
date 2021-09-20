package com.qa.abstractionandinterface;

public class Runner {

	public static void main(String[] args) {
		Bicycle bike = new Bicycle();
		SportsCar skyline = new SportsCar();
		Plane boeing777 = new Plane();
		Boat kgv = new Boat();
		
		bike.offroad();
		skyline.speed();
		boeing777.cruising();
		kgv.seas();
	}
}
