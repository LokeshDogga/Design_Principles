package com.accolite.DesignPrinciples.ProxyPattern;

public class Proxy_Pattern {

	private Proxy_Pattern proxy ;
	private boolean isAdmin = false;
	
	private Proxy_Pattern() {
		
	}
	
	public Proxy_Pattern(String user , String pwd) {
		if(user.equals(pwd)) {
			isAdmin = true;
		}
		else {
			isAdmin = false;
		}
	}
	
	public void runCommand(){
		if(isAdmin == false) {
			System.out.println("you have only limited privileges");
		}
		else {
			System.out.println("You have Admin Privileges");
		}
	}
	
	public static void main(String[] args) {

		Proxy_Pattern Admin1 = new Proxy_Pattern("lokesh" , "lokesh");
		Admin1.runCommand();
		Proxy_Pattern user1 = new Proxy_Pattern("lokesh","1234");
		user1.runCommand();

		
	}

}
