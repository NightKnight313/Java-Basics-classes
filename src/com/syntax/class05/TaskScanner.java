package com.syntax.class05;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println(age); {
			if (age>18) {
				System.out.println("You can get Your Driver Licence");
			} else {
				System.out.println("You will get Lerners permit ");
			}

	}
		System.out.println("Do You have credit card? Yes or No ");
		String answear=scan.next();
		if (answear.equalsIgnoreCase("no")) {
			System.out.println("We will offer you a credit card ");
		}else {
			System.out.println("What is the balance on the card");
			int balance = scan.nextInt();
			
			if (balance > 1000)	{
				System.out.println("Pay it of immediately");
			}else {
				System.out.println("You can spend more");
			}
		}
		

}
}