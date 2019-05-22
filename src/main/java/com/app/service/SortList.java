package com.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Fruit {
	int quantity;
	String name;
	
	public int getQuantity() {
		return quantity; 
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Fruit(int quantity, String name) {
		super();
		this.quantity = quantity;
		this.name = name;
	}

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fruit [quantity=" + quantity + ", name=" + name + "]";
	}
	
	
	
}

public class SortList {

	/**
	 * Java 8 lambda foreach List  
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		List<String> listObj = new ArrayList<>();
		listObj.add("Mango");
		listObj.add("Orange");
		listObj.add("Grapes");
		
		Fruit[] fruitList = new Fruit[] {
				new Fruit(40, "Mango"),
				new Fruit(30, "Orange"),
				new Fruit(20, "Grapes")
		};
		List < Fruit > fList = ((List) Arrays.asList(fruitList));		
		fList.sort(Comparator.comparing(f -> f.getQuantity()));
		System.out.println(fList);
		
	}
	
}
