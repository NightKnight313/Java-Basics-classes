package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//ctrl+space --> auto complete
		
		int i=100;
		double d=100;	// widening 
		
		System.out.println(i);		//100
		System.out.println(d);		//100.0  (conversion from 100-->100.0 (casting)  casting is converting from one type off value to another 
		/*
		 * widening / implicit / automatic
		 * byte -> short -> int -> long -> float -> double
		 * */
		long l=10000;
		
		// narrowing /explicit / manual 
		//byte b=130; Type mismatch: cannot convert from int to byte
		int x=(int)99.99; 	// narrowing 
		System.out.println(x);
		
		byte b=(byte)130;
		System.out.println(b);
		
		//Type mismatch: cannot convert from double to float
		float f=10.99f;
		
		double dd=9.99;
		
		double price=100;
		
		
	}

}
