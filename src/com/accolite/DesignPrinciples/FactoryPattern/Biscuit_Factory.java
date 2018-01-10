package com.accolite.DesignPrinciples.FactoryPattern;

public class Biscuit_Factory {
	public Biscuit get_Biscuit(String option) {
		
		switch(option) {
			case "A": 
				return new Cookie_Biscuit("Cookie" , 25);
			case "B":
				return new Salt_Biscuit("Salt",10);
			case "C":
				return new Cream_Biscuit("Cream" , 15);
			case "D":
				return new Monaco_Biscuit("Monaco",20);
			default:
				return null;
		}
	}	
}


class Biscuit{
	
	String name ;
	int price;
	
	public Biscuit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


class Cookie_Biscuit extends Biscuit {

	public Cookie_Biscuit(String name, int price) {
		super(name, price);
		System.out.println("Welcome to Cookie_Biscuit Factory");

	}
}

class Salt_Biscuit extends Biscuit {

	public Salt_Biscuit(String name, int price) {
		super(name, price);
		System.out.println("Welcome to Salt_Biscuit Factory");

	}
}
class Cream_Biscuit extends Biscuit {

	public Cream_Biscuit(String name, int price) {
		super(name, price);
		System.out.println("Welcome to Cream_Biscuit Factory");

	}
}
class  Monaco_Biscuit extends Biscuit {

	public Monaco_Biscuit(String name, int price) {
		super(name, price);
		System.out.println("Welcome to Monaco_Biscuit Factory");
	}
}