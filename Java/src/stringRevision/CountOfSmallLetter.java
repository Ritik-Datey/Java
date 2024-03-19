package com.srd;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfSmallLetter {

	public static void main(String[] args) {
		// Design a method to count how many small letters in each words.
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			char[] ch=s1[i].toCharArray();
			int count_small=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>='a' && ch[j]<='z')
				{
					count_small++;
				}
			}
			
			System.out.println(s1[i] + " count of small letter is " + count_small /*m1(ch)*/);
		}

	}
	
/*	public static int m1(char[] ch)
	{
		int count_small=0;
		for(int j=0;j<ch.length;j++)
		{
			if(ch[j]>='a' && ch[j]<='z')
			{
				count_small++;
			}
		}
		return count_small;
	} */

}
