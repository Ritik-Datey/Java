package com.srd;

import java.util.Arrays;
import java.util.Scanner;

public class FirstWordCapital {

	public static void main(String[] args) {
		// Design a method to convert every word first character to capital and remaining characters to lower.
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
		     String s2=s1[i];
		     char ch=s2.charAt(0);
		     String d=String.valueOf(ch).toUpperCase();
		     char ch1=d.charAt(0);
		     s2=s2.replace(ch,ch1);
		
		     s1[i]=s2;
		     
		}
		System.out.println(Arrays.toString(s1));

	}

}
