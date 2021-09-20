package com.qa.calculatorscanner;

public class Calculator {
          public static double result;
          
          public static double add(double num1, double num2) {
        	  result = num1 + num2;
        	  return result;
          }
          
          public static double sub(double num1, double num2) {
        	  result = num1 - num2;
        	  return result;
          }
          
          public static double mul(double num1, double num2) {
        	  result = num1 * num2;
        	  return result;
          }
          
          public static double div(double num1, double num2) {
        	  result = num1 / num2;
        	  return result;
          }
          
}
