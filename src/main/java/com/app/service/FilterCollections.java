package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Fruit2 {
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
	
	public Fruit2(int quantity, String name) {
		super();
		this.quantity = quantity;
		this.name = name;
	}

	public Fruit2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fruit [quantity=" + quantity + ", name=" + name + "]";
	}
	
	
	
}

public class FilterCollections {

	/**
	 * Java 8 lambda foreach List  
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		List<String> listObj = new ArrayList<>();
		listObj.add("Mango");
		listObj.add("Orange");
		listObj.add("Grapes");
		
		List<Fruit2> fruitList = new ArrayList<Fruit2>();
		fruitList.add(new Fruit2(20,"Mango"));
		fruitList.add(new Fruit2(30,"Orange"));
		fruitList.add(new Fruit2(40,"Grapes"));
		
		
		List < Fruit2 > fruitQuantityMoreThan30 = fruitList
				.stream()
				.filter(c-> c.getQuantity() >= 30)
				.collect(Collectors.toList());
		System.out.println(fruitQuantityMoreThan30);
				
		
	}
	
}
