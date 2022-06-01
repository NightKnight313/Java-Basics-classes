package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		/*
		 * when your code has no errors always try to format it
		 * 
		 * mac cmd+shift+f windows ctr+shift+f
		 */

		int temp = 15;

		if (temp < 32) {

			System.out.println("water will freeze with temperature " + temp);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use jacket and a scarf");

		} else {
			System.out.println("water will not freeze with temperature " + temp);
			System.out.println("It is not that cold outside then");
		}

		System.out.println("Continues code");
		System.out.println("I am code outside of it block");
	}

}
