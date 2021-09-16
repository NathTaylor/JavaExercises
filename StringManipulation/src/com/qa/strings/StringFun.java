package com.qa.strings;

public class StringFun {

	public static void main(String[] args) {
//		 String str1 = "yesterday it was raining";
//		 String str2 = "today it is sunny";
//		 System.out.println(str2.toUpperCase()+", "+str1.toUpperCase());

		 
		 String str1 = "yesterday it was raining";
		 String str2 = "today it is sunny";

		 String mySubString1 = str2.substring(0, 11);
		 String mySubString2 = str1.substring(16, 24);
		 System.out.println(mySubString1.toUpperCase() + mySubString2.toUpperCase());
		 
	}
}

//	    String str1 = "Welcome to the darkside";
//	    int stringLength = str1.length();
//        System.out.println("String Length is " + stringLength);
////	
//		String str1 = "Welcome to the darkside";
//		String[] splitString = str1.split(" ");
//		for (String s : str1)
//        System.out.println(s);
//	
		
		
		
//	}
//	public static void messFind() {
//		String str1 = "Message";
//		String str2 = "g";
//		System.out.println(str1.contains(str2));
//	}
//}
