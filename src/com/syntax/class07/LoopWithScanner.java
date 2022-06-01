package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
			/*
			 * we are going to ask you if you got a job 
			 * we will contniuosly asking if you get job untill you say yes !
			 * 
			 *  once you say yes --> Congratulations !
			 */
		
		Scanner 
=new Scanner(System.in);
		String job;
		
		do {
			
		System.out.println("Did you get a job?");
		job=scan.nextLine();
		
		}while 	(!job.equalsIgnoreCase("Yes"));
		
		System.out.println("Congratulations");
		System.out.println("------------------------------------------------");
		
		Scanner input=new Scanner(System.in);
		String offer;
		
		System.out.println("Did you get a job?");  	// for while we need to repeat condition in order to get inside code 
		offer=input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes"))	{
			System.out.println("Did you get the job");
			offer=input.nextLine();
		
		}
	}

}
