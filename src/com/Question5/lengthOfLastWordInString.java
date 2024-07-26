package com.Question5;

public class lengthOfLastWordInString {

	public static void main(String[] args) {
		String s1 = "     Hey i am Smit Savla     ";
		s1 = s1.trim();
		System.out.println(s1);
		int count =0;
		char inputArray[] = s1.toCharArray();
		
		for (int i=inputArray.length-1; i>=0; i--)
		{
			if (inputArray[i]!= ' ') {
				count=count+1;
			}
			else {
				if (count>0)
				System.out.println(count);
				break;
			}
		}

	}

}
