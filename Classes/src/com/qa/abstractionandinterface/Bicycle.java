package com.qa.abstractionandinterface;

public class Bicycle implements interfaceSpeed, interfaceWheels {

	@Override
	public void speed() {
		System.out.println("An average bike speed is: 15 mph");
		
	}

	@Override
	public void power() {
		System.out.println("A bicycle is powered by the human riding it");
		
	}

	@Override
	public void wheels() {
		System.out.println("A bike has 2 wheels");
		
	}
	
	public void offroad() {
    	System.out.println("Bikes are great for off-road trails");
    }
}
