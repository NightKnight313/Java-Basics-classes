package com.syntax.class04;

public class TaskPositiveNegative {

	public static void main(String[] args) {
		/*
		 * Write a program to check
		 * whether number is positive or negative.
		 */
		int num1=7;
		
		if (num1>=0)	{
			System.out.println(num1+" is positive ");
		}else if (num1 = 0)	{		// --->  error will show since condition is not boolean 
			System.out.println(num1+" is not positive or negative ");
		}else {
			System.out.println(num1+" is negative ");
		}

	}

}
