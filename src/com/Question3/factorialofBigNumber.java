package com.Question3;

import java.math.BigInteger;

public class factorialofBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=50;
		BigInteger result = BigInteger.ONE;
		for (int i =1; i<=number;i++) {
			
		result = result.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("factorinal of given Number is =" +result);
	}

}
