package com.syntax.class10;

public class MoreExampls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums= {
				{1, 2, 3, 4, 5},
				{199, 300, 588, 700},
				{1900, 4578, 98787}	};
		
		System.out.println("All values using enchanced for loop ");
			/* enhanced for loop uses varaibles to acces elements from an array
			 * outer for loop --> iterates over 1D array 
			 * inner loop --> iterates over elements of each 1D array 
			  */
		for(int[] num:nums)		{
			
			for (int n:num)		{
				System.out.print(n+" ");
			}
		}
		
		
		
		
		
		System.out.println("All values using regural for loop ");
			/* i loop iterates over rows 
			 * nums.length gives # of arrays inside 2D array  =3
			 * j loop iterates over columns
			 */
		for(int i=0;	i<nums.length;	i++)	{
			
				for(int j=0;	j<nums[i].length; 	j++) {
				
					System.out.print(nums[i][j]+" ");
				}
				System.out.println();
		}
		System.out.println("All values using enchanced for loop ");
}
}
