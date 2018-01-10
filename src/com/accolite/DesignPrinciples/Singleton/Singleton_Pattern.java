package com.accolite.DesignPrinciples.Singleton;

public class Singleton_Pattern {

	private static Singleton_Pattern obj= null;
	String id;
	private Singleton_Pattern() {
		this.id = "base";
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static synchronized Singleton_Pattern get_Singleton_object() {
		if(obj == null) {
			synchronized(Singleton_Pattern.class){
				if(obj == null)
				obj = new Singleton_Pattern();
			}
		}
		return obj;
	}
}


