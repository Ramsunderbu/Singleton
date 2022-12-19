package org.single;

public class Singleton {
	
	static Singleton sing;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if (sing == null) {//a==0
			sing = new Singleton();//a=20
		}
		return sing;
		
	}
	public static void main(String[] args) {
		
		Singleton s =  getInstance();
		System.out.println(s);
		Singleton s1 =  getInstance();
		System.out.println(s1);
		Singleton s2 =  getInstance();
		System.out.println(s2);
		
	}
}
