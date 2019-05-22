package com.app.service;

import java.util.ArrayList;
import java.util.List;

public class ForLoopAssignVariables {

	/**
	 * Java 8 lambda foreach List  
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		final String[] rollNumber = {null};
		/**
		 * If you try to assign a variable inside lambda, which was global or declared outside, you will encounter this error — 
		 * “Variable used in lambda expression should be final or effectively final”
		 */
		//String rollNumber = null; 
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("James");
		names.add("Joses");
		
		names.forEach(n -> {
			if (n.equals("John")) 
				rollNumber[0] = "1001";			
		});
		System.out.println(rollNumber[0]);
		
		//-- The better, functional way of dealing with this to stream and filter:
		String rollN;
		rollN = names.stream()
				.filter(n -> n.equals("John"))
				.findAny()
				.map(v -> "1001")
				.orElse(null);
		System.out.println("RollNumber "+ rollN);
	}
	
}
