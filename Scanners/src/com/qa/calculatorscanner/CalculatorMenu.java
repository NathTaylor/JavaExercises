package com.qa.calculatorscanner;

import java.util.Scanner;

public class CalculatorMenu {

	Scanner input = new Scanner(System.in);

	public void menu() {

		boolean menuFlag = true;
		String menuOption = "";
		double num1;
		double num2;

		System.out.println("Welcome to the calculator");
		
		while (menuFlag) {
			
			System.out.println("/" + "=====================================" + "\\");
			System.out.println("|" + "       Select Your Operation         " + "|");
			System.out.println("\\" + "=====================================" + "/");
			System.out.println("|" + "\t1|" + "            Addition        " + "|");
			System.out.println("|" + "\t2|" + "          Subtraction       " + "|");
			System.out.println("|" + "\t3|" + "        Multiplication      " + "|");
			System.out.println("|" + "\t4|" + "           Division         " + "|");
			System.out.println("/" + "=====================================" + "\\");
			System.out.println("|" + "\t0|" + "             Exit           " + "|");
			System.out.println("\\" + "=====================================" + "/");
			
			System.out.println("Select your option: ");
			
			menuOption = this.input.nextLine();
			
			switch (menuOption ) {
			case "1":
				System.out.print("Please enter first number: ");
				num1 = input.nextInt();
			    System.out.print("Please enter second number: ");
				num2 = input.nextInt();
			    System.out.println();
			    input.nextLine();
			    System.out.println("Your answeris: " + Calculator.add(num1, num2));
			    break;
			    
			case "2":
				System.out.print("Please enter first number: ");
				num1 = input.nextInt();
			    System.out.print("Please enter second number: ");
				num2 = input.nextInt();
			    System.out.println();
			    input.nextLine();
			    System.out.println("Your answer is: " + Calculator.sub(num1, num2));
			    break;
			    
			case "3":
				System.out.print("Please enter first number: ");
				num1 = input.nextInt();
			    System.out.print("Please enter second number: ");
				num2 = input.nextInt();
			    System.out.println();
			    input.nextLine();
			    System.out.println("Your answeris: " + Calculator.mul(num1, num2));
			    break;
			    
			case "4":
				System.out.print("Please enter first number: ");
				num1 = input.nextInt();
			    System.out.print("Please enter second number: ");
				num2 = input.nextInt();
			    System.out.println();
			    input.nextLine();
			    System.out.println("Your answeris: " + Calculator.div(num1, num2));
			    break;
			    
			case "0":
				menuFlag = false;
				System.out.println("Closing..");
				break;
				
		    default:
		    	System.out.println("Try again: ");
			}
		}
 
	}
}
