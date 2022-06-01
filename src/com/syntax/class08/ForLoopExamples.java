package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		
		// I/ need to print numbers from 1 to 90
			
		for	(int i=1; i<=90; i++)	{
			System.out.print(i+" ");
		}
		
		/*start point
		 * end point 
		 * increment/decrement 
		 */
		
		//i need numbers from 60 to 10
		System.out.println();
		
		for	(int b=60; b>=10; b--)	{
			System.out.print(b+" ");
		}
		
		System.out.println();
		// what is the output ?
		
		for (int i=5; i<=40; i+=5)	{
			System.out.print(i+" ");
		}
	}

}
