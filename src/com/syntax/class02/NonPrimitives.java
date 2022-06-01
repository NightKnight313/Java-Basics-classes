package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg ";
		String lastName="Smith";
		
		long phone=6463188833l;
		
		//xxx-xxx-xxxx
		String phoneNumber="123-456-7890";
		String Address="123 Washington str";
		
		String age ="10";
		String city="Miami";
		
		//shortcut for printing 
		// syso +ctrl +space --> hit enter 
		
		/* we can use +
		 * 				to attach String to String 
		 */
		System.out.println(name+lastName);// Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old 
		age="30";
		System.out.println(name+" is "+age+" years old.");
		
		/*
		 * Rules for identifiers
		 * 1. no space
		 * 2. no keywords 
		 * 3. cannot start with numbers  (numbers can be used after the 
		 * 4. cannot have with special character(except_, $)
		 */
		
		//String break="Hello";
		//int 1number=10; error
		int number1=10;
		
		//int num%=20;  error 
		double $price=3.99;
		float f_=2.09f;
		
	}

}
