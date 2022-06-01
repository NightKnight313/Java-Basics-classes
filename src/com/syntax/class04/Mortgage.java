package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		
		int rate=5;
		int price=60000;
		
		
		if (rate>4.50)	{
			System.out.println("We will not buy house");
		}else  if{
			System.out.println("We will buy house");
			}else if(price>50000)	{
			System.out.println("We will take loan");
		}else {
			System.out.println("We will pay cash");
		}
	}

}
