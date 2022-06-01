package com.syntax.class02;

public class VariablesName {

	public static void main(String[] args) {
		
		String name="Greg";
		String lastName="Batman";
		char grade='A';			//declaration
		String city="Brooklyn";
		String state="NY";
		long phoneNumber=6463338899L;
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		city="Tampa";
		state="FL";
		phoneNumber=6465557733L;
		grade='B';
		
		System.out.println("My name is "+name+"" 
				+" and I moved to new city "+city+" and my new state "+state+". "
					+"My new phone number is "+phoneNumber);
		
	}

}
