package com.Question6;

public class EvenWordsfromString {

	public static void main(String[] args) {
		
		String s1 ="i am smit bharat savla";
		
		String dataArray[]= s1.split(" ");
		
		for (String word: dataArray) {
			int lenght = word.length();
			if (lenght%2 == 0) {
				System.out.println(word);
			}
		}
		
		
	}

}
