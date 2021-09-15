package com.qa.arrays;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long[] ageArray = new long [6]; 
        
        ageArray[2] = 24;
        
        for(long i : ageArray) {
        	System.out.println(i);
        }
        	
	}

}
