package com.syntax.class09;

public class ArrayExamples {
	
	public static void main(String[] args) {
		
		// i want to store price in array 
		
		double [] price=new double[4];
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		
		System.out.println(price[0]);
		
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		//numbers[3]=13;			//if [3] Index 3 out of bounds for length 3
		
		System.out.println(numbers[1]);
		
		//arrays are fixed in size 
		// during runtime  JAVA cannot increase or decrease a size of an array 
	}

}
