package com.iptsrini;

public class Variables {
 
	static int a=50 ;
	 public  void sample() {
		int a=10; // Local Variable
		System.out.println(a);
	}
	public static void main(String[] args) {
		Variables  v = new Variables();	
		v.sample();
		System.out.println(a);
		
		
	}
}
