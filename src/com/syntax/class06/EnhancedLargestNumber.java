package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		
		int num1 = 200;
		int num2 = 200;
		int num3 = 200;
		
		/* the compiler can initialize variables to it's default 
		int largest = 0;  //instead os syso
		*/
				
				if ( num1 > num2 && num1 > num3)	{
					largest=num1;
					//System.out.println("The largest number is " + num1);
					
				}else if (num3 > num1 && num3 > num2)	{
					largest=num3;
					//System.out.println("The largest number is " + num3);
					
				}else if (num2 > num1 && num2 > num3)	{
					largest=num2;
					//System.out.println("The largest number is " + num2);
				}else {
					System.out.println("All numbers are equal");
				}
				if (largest != 0 ) {
				System.out.println("The largest number is "+ largest);
				//The local variable largest may not have been initialized
	}

}
