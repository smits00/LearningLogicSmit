package com.Question4;

public class FindNumberisEvenOddUsingBitwiseOperation {

	public static void main(String[] args) {
		int number= 4;
	
		
		if ((number&1) ==0)
		{
		System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
