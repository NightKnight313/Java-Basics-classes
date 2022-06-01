package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		
		for(int i=1;	i<=3;	 i++)	{		// outer loop 
			System.out.println("Hello");
			
			for(int y=1; y<=2; y++) {		// nested loop (inner loop )
				System.out.println("Bey");
			}
		}
		System.out.println("--------------------------------");
		
		for(int i=1;	i<=3;	 i++)	{		// outer loop controls inner loop 
			System.out.print(i+" ");
			
			for(int y=1; y<=2; y++)	{	// inner  loop depends on outer loop
					System.out.print(y+" ");
			}
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1;	i<=3;	 i++)	{
			
			for(int y=1;	y<=2;	y++) {
				
				System.out.println(i+" "+y);
			}
		}
		
		System.out.println("----------------------------------");
		
		for(int i=1;	i<=3;	 i++)	{
			System.out.println("Hello");
		
			for(int y=1;	y>=2;	 y++)	{	// condition is fals y>=2 output willbe only Hello Hello Hello 
				System.out.println("Bey");
			}
		}
		
		System.out.println("---------------------------------");
		
		for(int i=1;	i>=3;	 i--)	{
			System.out.println("Hello");
			
			for(int y=1;	y<=2;	 y++)	{
				System.out.println("Bey");
			}
		}
		
		for(int i=1;	i<=9;	 i++)	{  // counter loop 001-->999 and so on 
			for(int y=1;	y<=9;	 y++) {
				for(int x=1;	x<=9;	 x++) {
					System.out.println(i+" "+y+" "+x);
				}
			}
		}
	}

}
