package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean job=true;
		double salary=110000;
		
		if (job	&&	salary>=100000)	{
			System.out.println("I am super Happy ");
		}
		System.out.println("--------------------------------------------------------");
		
		boolean study=true;
		boolean homework=false;
		boolean practice=true;
		
		if (study && homework && practice)	{
			System.out.println("You will succeed in the course");
		}else	{
			System.out.println("You will struggle ");
		}
		
			System.out.println("--------------------------------------------------------");
		
		int num1 = 65;
		int num2 = 62;
		int num3 = 23;
		
		if (num1>num2 && num1>num3)	{
			System.out.println("Thr largest number is " + num1);
		}else if (num3 > num1 && num3 > num2)	{
			System.out.println("The largest number is " + num3);
		}else if (num2 > num1 && num2 > num3)	{
			System.out.println("The largset number is " + num2);
		}
	}

}
