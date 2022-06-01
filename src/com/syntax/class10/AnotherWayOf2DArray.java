package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		// 1 array -> NY --> all cities of NY state 
		//2 array -> CA
		
		
		
		String [][] usa= {	{"New York", "Albany","Buffalo"},
									{"Los Angeles", "San Fransisco","San Jose","San Diego","Redding"},
									{"Miami","Orlando","Niceville","Tampa"},
									{"McLean","Richmond","Leesburg"}	};
		
		System.out.println("Retrieve all values using for each loop ");
		for (String[] state:usa)		{
			for (String city:state)	{
				System.out.print(city+" ");
			}
			System.out.println();
		}

		
	}

}
