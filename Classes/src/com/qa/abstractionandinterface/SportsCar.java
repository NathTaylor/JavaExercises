package com.qa.abstractionandinterface;

public class SportsCar implements interfaceSpeed, interfaceWheels {

	@Override
	public void speed() {
		System.out.println("A sports car average top speed is : 120 mph ");
		
	}

	@Override
	public void power() {
		System.out.println("A sports car is powered by a Six-cylinder engine");
	}
	
	@Override
	public void wheels() {
		System.out.println("A car has 4 wheels");
		
	}
	public void track() {
		System.out.println("Take your sports car to the track to test it's limits");
	}
	

}
