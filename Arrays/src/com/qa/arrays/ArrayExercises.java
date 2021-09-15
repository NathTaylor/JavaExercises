package com.qa.arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		arrayMaker();

////		Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
//
//		int[] houseNumbers = new int [10];
//		houseNumbers[0] = 1;
//		houseNumbers[1] = 3;
//		houseNumbers[2] = 6;
//		houseNumbers[3] = 12;
//		houseNumbers[4] = 46;
//		houseNumbers[5] = 56;
//		houseNumbers[6] = 64;
//		houseNumbers[7] = 69;
//		houseNumbers[8] = 99;
//		houseNumbers[9] = 420;
//		
//		for(int i : houseNumbers) {
//			System.out.println(i);
//		}

//     Create a for loop that populates an integer array with values, outputting them at each iteration.
//		Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

	}

	public static void arrayMaker() {
		int[] ageArray = new int[20];
		for (int i = 0; i < 20; i++) {
			ageArray[i] = i + 1;
			System.out.println(ageArray[i]);

		}
		for (int i : ageArray) {
			System.out.println(i * 10);
		}
	}
}
