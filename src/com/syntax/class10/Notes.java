package com.syntax.class10;

public class Notes {

	public static void main(String[] args) {
		//Array 
		
		String[] disney= {"Shrek","Elsa","Goofy","Mulan", "Tom&Jerry"};
		
		System.out.println(disney[1]); //Elsa 
		System.out.println("All elements using  regural for loop ----------");
		
		// to get all elements from array 
		for (int i=0; i<disney.length; i++)	{
			//System.out.print(disney[i]+" ");
			if(disney[i].equalsIgnoreCase("Shrek"))	{
				System.out.print(disney[i]+ " is my favorite character");
			}
		}
		
		System.out.println("All elements using  regural for loop ----------");
		
		for(String character:disney)	{
			if(character.equalsIgnoreCase("Mulan")) {
			System.out.print(character+ " is my favorite character");
			}else {
				System.out.println(character+ "   ");
			}
			System.out.print(character+" ");
			
		}
	}

}
