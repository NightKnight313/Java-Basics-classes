package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		// print numbers from 1 to 10 ;
		
		int	num=1;
				
		while(num<=10)		{
			//num++; in here will alwasy add 1 more to the print 
			System.out.print(num);	// to print in 1 line only print , if want to ad spaces add (num+" ") in to code 
			num++;
		}
		// print numbers from 1 to 10 ;
		System.out.println();
		int num1=1;
		
		while (num1<10)		{ 	// if want to keep number of prints change the sing in while from <= to < only 
			num1++;
			System.out.print(num1+" ");
		}
		
		//print numbers from 10 to 100;
		System.out.println();
		
		int a=10;
		
		while (a<=100)		{
			System.out.print(a+" ");
			a++;
		}
		 
		
		//print numbers from 10 to 1;
		System.out.println();
		
		int b=10;
		
		while(b>=1)		{	//it will be infinite loop if (b<=10) 
			System.out.print(b);
			b--;
		}
		
		// print numbers from 100 to 50 ;
		System.out.println();
		
		int c=100;
		
		while (c>=50)		{
		System.out.print(c+" ");
		c--;
		}
		
		// print numbers from -1 to -10
		System.out.println();
		
		int d=-1;
		
		while(d>=-10)	{
			System.out.print(d+" ");
			d--;
		}
		
		// print numbers from 1 to 20 but only even numbers '
		System.out.println();
		// one way to do it 
		int f=2;
		
		while(f<=20)	{
			System.out.print(f+" ");
			f+=5;
		}
		// second way 
		System.out.println();
		int g=2;
		
		while (g<=20) 	{
			if (g%2==0) {
			System.out.print(g+" ");
			}
			g++;
		}
		// print even numbers from 20 to 100;
		System.out.println();
		int h=20;
		
		while (h<=100)		{
			System.out.print(h+" ");
			h+=2;
		}
		// print odd numbers from 100 to 1 ; K
		System.out.println();
		
		int k=100;
		
		while(k>=1)	{
			if(k%2!=0)	{	//  != use for not equals ( odd number for example)
				System.out.print(k+ " ");
			}
			k--;
		}
		//another way for K;
		System.out.println();
		int y=99;
		while (y>=1)	{
			System.out.print(y+" ");
			y-=2;
		}
		
		
	}
}
