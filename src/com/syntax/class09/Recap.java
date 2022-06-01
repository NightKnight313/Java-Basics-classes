package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=1; 	i<=5; i++)	{
			
			System.out.print(" Hello ");
				
			for(int y=1; y<=3; y++)	{		// if y-- the inner loop is infinite but can be stoped by
														// adding break; after code
			
				System.out.print("Bye");
			
				//break;		 Hello Bye Hello Bye Hello Bye Hello Bye Hello Bye
				}
		// 	break;		 Hello ByeByeBye
		}		 //Hello ByeByeBye Hello ByeByeBye Hello ByeByeBye Hello ByeByeBye Hello ByeByeBye

	}

}
