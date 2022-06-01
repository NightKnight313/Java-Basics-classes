package com.syntax.class10;

public class taskArray {

	public static void main(String[] args) {
		//1. From an array of integer elements find the largest number.

		//2. Create an array to store char values and then print those in reverse order
		
		//1.
		//int size 
		//int []  x= {1, 2, 9, 4, 7};
		//size = x.length;
		
		//for(int  x= 0; x<size; x++)	{
		//}
		
		
	//	teacher example 
		int[]  array = {5, 28, 36, 1, 14, 56, 48, 17};
		int max = array[0];
				for (int i=1; i < array.length;  i++)	{
					if (array[i] > max)	{
						max = array[i];
					}
				}
				System.out.println("the largest number is "+ max);
				
				System.out.println("---------------------------------");
				
				char[] values = {'a', 'b', 'c', 'd' };
				for (int i = values.length - 1 ;  i >= 0; i--)	{
					System.out.println(values[i] + " ");
				}
}
}