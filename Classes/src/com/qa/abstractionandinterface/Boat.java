package com.qa.abstractionandinterface;

public class Boat implements interfaceSpeed {

	@Override
	public void speed() {
		System.out.println("The average top speed of a boat is: 34 mph");
	}
	
	@Override
	public void power() {
		System.out.println("We're running on Admiralty boiler power!");
		
	}
	
	public void seas() {
		System.out.println("Fair Winds and Following Seas");
	}


	
}
