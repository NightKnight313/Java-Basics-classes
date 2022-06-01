package com.syntax.class09;

public class MoreNesteedLoops {

	public static void main(String[] args) {
		// how to creat multiplication table 
		
		for (int x=1; x<=10; x++)	{
			for (int y=1; y<=10; y++)	{
				System.out.print(x+" x "+y+" = "+(x*y));
			}
			System.out.println("---------------------------------");
		}

	}

}
