package com.syntax.class02;

public class MathHomework {

	public static void main(String[] args) {
		/*
		 * 1.Write a Java program to add, subtract, multiply, and divide 2 decimal values.
		 * " The _______ of 2 numbers ___ and ____ is equal to____"
		 * 
		 *2.Write a program to find the square of the number 3.9 . Your program should say
		 *" The square of the ___ is ___"
		 *
		 *3. Write a program to print the area and perimeter of a rectangle with 
		 *    width = 5 and height = 8 .
		 *  Your program should say. " The perimiter of a rectangle with width ___ and  height __
		 *  is equal to ___ and the are is ___ ."
		 */
		
		// 1.
		        double num1=3.3;
				double num2=4.5;
				String a="addition";
				String b="substraction";
				String c="multiplication";
				String d="division";
				
				double  sum,  sub,  multi,  div;
					sum=num1+num2;
					sub=num1-num2;
					multi=num1*num2;
					div=num1/num2;
					
			System.out.println("The  "+a+" of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
			System.out.println("The  "+b+" of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
			System.out.println("The  "+c+" of 2 numbers "+num1+" and "+num2+" is equal to "+multi);
			System.out.println("The  "+d+" of 2 numbers "+num1+" and "+num2+" is equal to "+div);
			
			//2.
			System.out.println("_____________________________________");
			float f=4;
			float square=f*f;
			
			System.out.println("The square of the "+f+" is "+square);
			
			//3.
			System.out.println("_____________________________________");
			
			int w=5;
			int h=8;
			int perimeter=(w+h);
			int area=w*h;
			
			System.out.println("The perimiter of a rectangle with width "+w+" and  height "+h+ " is equal to "+ perimeter+" and the are is "+area);
			
					
		
	}

}
