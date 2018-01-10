package com.accolite.DesignPrinciples.FactoryPattern;
import java.util.Scanner;

public class Client_Biscuit {

	public static void main(String[] args) {

		System.out.println("Welcome to Biscuit Factory");
		System.out.println("Choose your Biscuit" + "\n" + "A -->Cookie" +
				"\n" + "B -->Salt" +
				"\n" + "C -->Cream" +
				"\n" + "D -->Monaco");
		Scanner sc = new Scanner(System.in);
		String option = sc.nextLine();
		Biscuit_Factory bis = new Biscuit_Factory();
		Biscuit b = bis.get_Biscuit(option);	
		if(b != null)
		System.out.println("type : " + b.getName() + "  Price : " + b.getPrice());
		else
			System.out.println("You entered invalid option");
	}

}
