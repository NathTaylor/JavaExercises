package com.qa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListExercise {

	public static void main(String[] args) {
		List<String> tools = new ArrayList<>();

		tools.add("Hammer");
		tools.add("Wrench");
		tools.add("Screwdriver");
		tools.add("You");
		tools.add("JCB");
		System.out.println(tools);
//		
//		for (int i = 0; i < tools.size(); i++) {
//			System.out.println(tools.get(i));
//		}
//		
//		for (String i : tools) {
//			System.out.println(i);
//		}
//	
		System.out.println(tools.get(3));
		
		tools.set(2, "Flathead Screwdriver");
		System.out.println(tools.get(2));

		tools.remove(4);
		System.out.println(tools);
	
        Collections.sort(tools);
        System.out.println(tools);
	
	}

}
