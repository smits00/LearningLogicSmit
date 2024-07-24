package com.Question2;

public class reverseNumber1 {

	public static void main(String[] args) {
		
		// reverse the number 123
		int number = 123;
		int reverseNumber = 0;
		int lastNumber;
		
		while (number != 0)
				{
			lastNumber = number%10;
			
			//check for flow
			if (reverseNumber >Integer.MAX_VALUE /10 || (reverseNumber == Integer.MAX_VALUE/10 && lastNumber>7)) {
				System.out.println(0);
				System.exit(0);
			}
			
			if (reverseNumber <Integer.MIN_VALUE /10 || (reverseNumber == Integer.MIN_VALUE/10 && lastNumber<-8)) {
				System.out.println(0);
				System.exit(0);
			}
			
			reverseNumber = reverseNumber*10 + lastNumber;
			
			number = number/10;
				}
		System.out.println("Reverse Number of 123 is= "+reverseNumber);
		

	}

}
