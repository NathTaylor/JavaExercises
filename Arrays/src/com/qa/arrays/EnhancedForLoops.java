package com.qa.arrays;

public class EnhancedForLoops {

	public static void main(String[] args) {

//		Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.

//		String[] Cats = new String [10];
//        Cats[0] = "short";
//        Cats[1] = "fat";
//        Cats[2] = "round";
//        Cats[3] = "fluffy";
//        Cats[4] = "dumb";
//        Cats[5] = "smart";
//        Cats[6] = "greedy";
//        Cats[7] = "kitten";
//        Cats[8] = "Neeko";
//        Cats[9] = "Yuumi";
//        
//        for (String str : Cats) {
//        	System.out.println(str);
//        }

//        Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.

		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			
			
			for (int i : array2) {
				System.out.println(i * i);
			}
			
		}
}
