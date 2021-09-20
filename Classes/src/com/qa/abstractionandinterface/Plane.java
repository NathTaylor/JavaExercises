package com.qa.abstractionandinterface;

public class Plane implements interfaceSpeed, interfaceWheels {

	@Override
	public void speed() {
		System.out.println("The average top speed of a plane is: 621 mph");
		
	}
	
	@Override
	public void power() {
		System.out.println("An airliner is powered by gas turbine engines");
		
	}


	@Override
	public void wheels() {
		System.out.println("A plane uses landing gear only");
		
	}

	
	public void cruising() {
		System.out.println("We're cruising at 35,000ft");
	}

}
