package com.syntax.class09;

public class HWClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int a = 0; a <= 2; a++) {		//hrs
			for (int b = 0; b <= 3; b++) {
				for (int c = 0; c <= 5; c++) {
					for (int d = 0; d <= 9; d++) {
								System.out.println(a + "" + b + ":" + c + "" + d);
					}
				}
			}
		}	
	
	System.out.println("_----------------------");
	// another way 
	int hrs = 0;
	int min = 0;
	for (hrs = 0; hrs <= 24; hrs++) {
		if (hrs == 24 && min == 60) {
			System.out.println(hrs + ":" + min);
			continue;
		}
		for (min = 0; min <= 60; min++) {
			if (min < 10 & hrs < 10) {
				System.out.println("0" + hrs + ":0" + min);
				} else if (min < 10) {
				System.out.println(hrs + ":0" + min);
					} else if (hrs < 10) {
						System.out.println("0" + hrs + ":" + min);
					} else {
						System.out.println(hrs + ":" + min);
			}
		}
	}
	System.out.println(" Teachers code   ");
		
	System.out.println("   Clock   ");
	
	for (int hrs = 0;   hrs < 24;  hrs++)	{
		for (int min = 0;  min < 60;  min++)	{
			string time;
			
			if (hrs<10 && min<10)	{
				time="0"+hrs+":"+"0"+min;
				System.out.println(time);
			}
		}
	}
}
}
