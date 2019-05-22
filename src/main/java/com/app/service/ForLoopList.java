package com.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForLoopList {

	/**
	 * Java 8 lambda foreach List  
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		List<String> listObj = new ArrayList<>();
		listObj.add("John");
		listObj.add("James");
		listObj.add("Joses");
		
		// --- LISTING 1: Iterate using for loop
		System.out.println("LISTING 1.1.....");

		//-- Standard Process
		for(int i=0; i<listObj.size(); i++) {
			System.out.println(listObj.get(i));
		}
		
		System.out.println("LISTING 1.2.....");
		//-- Iterator
		Iterator<String> it = listObj.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}

		System.out.println("LISTING 2.....");
		// --- LISTING 2 : Iterate using enhanced for Loop (Java 5)
		for(String str: listObj) {
			System.out.println(str);
		}
		
		//-- Lambda ForEach
		System.out.println("LISTING 3.....");
		//-- LISTING 3 : Java 8 Lambda forEach
		listObj.forEach(name -> System.out.println(name));
		
		
	}
	
}
