package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		
		
			/*
			 * declare a secret number'
			 * you want to ask user to guess your number
			 * code should keep asking to guess intil gets your secret number
			 * --> you got it 
			 */
		
		int secretNum = 1;
		int guessNum;
		
		Scanner scan = new Scanner(System.in);
		
		do 	{
			System.out.println("Guess my secret number");
			guessNum = scan.nextInt();
		}while (guessNum !=secretNum);
		
		System.out.println("You go it!");
	}

}
