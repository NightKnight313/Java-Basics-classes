package com.syntax.class05;

import java.util.Scanner;

public class userScaner {

	public static void main(String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name=scan.next(); 	//capture String
		System.out.println(name);
	
		
		System.out.println("Please enter age");
		int age=scan.nextInt(); 		// capture int 
		System.out.println(age);{
		if (age<30) {
			System.out.println("Get a job");
		} else {
			System.out.println("Get Vacation");
		}
		}
		System.out.println("Please  enter price beetwen 10 and 150");
		double price=scan.nextDouble(); 		//capture double 
		System.out.println(price);
		if (price<75) {
			System.out.println("Let's go to cinema");
		}else {
			System.out.println("Fly to Miami :P");
		}
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean();		//capture boolean
		System.out.println(boo);
		
	}
}
