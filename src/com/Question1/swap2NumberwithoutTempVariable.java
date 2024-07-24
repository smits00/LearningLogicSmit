package com.Question1;

public class swap2NumberwithoutTempVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;		// Note - in ExOr 0^0 = 0 , 1^1 = 0, 0^1 = 1 , 1^0 = 1
		b=a-b;
		a=a-b;

		System.out.println("a= "+a);
		System.out.println("b= "+b);


	}

}
