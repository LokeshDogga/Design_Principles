package com.accolite.DesignPrinciples.Singleton;

public class Singleton_Usage implements Runnable{

	void call_singleton() {
	
		Singleton_Usage d1 = new Singleton_Usage();
		Singleton_Usage d2 = new Singleton_Usage();
		Thread t1 = new Thread(d1,"t1");
		Thread t2 = new Thread(d2,"t2");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton_Pattern obj1 = Singleton_Pattern.get_Singleton_object();
		Singleton_Pattern obj2 = Singleton_Pattern.get_Singleton_object();
		
		if(obj1 == obj2) {
			System.out.println("yes");
		}
		Singleton_Usage d = new Singleton_Usage();
		d.call_singleton();

	}
	@Override
	public void run() {
		System.out.println("yes");
		Singleton_Pattern obj1 = Singleton_Pattern.get_Singleton_object();
		obj1.setId(Thread.currentThread().getName());
	}

}
