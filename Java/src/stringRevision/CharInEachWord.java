package com.srd;

import java.util.Arrays;
import java.util.Scanner;

public class CharInEachWord {

	public static void main(String[] args) {
		// Design a method to display how many characters in each words along with the word.
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
		String[] s1=s.split(" ");
		
	    System.err.println(Arrays.toString(s1));
	
		
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			char[] ch=s1[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				count++;
			}
			System.out.println(s1[i] + " word in character is " + count);
		}
		
		// Design a method to count how many words in your sentence.
		System.out.println("word in Sentence is " + (s1.length));

	}

}
