package com.srd;

import java.util.Arrays;
import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		/** Design a method to count number of vowels, consonant, digits, special characters,
		capital letters, small letters in the given string.**/
		
		Scanner sc=new Scanner(System.in);
		String s=new String(sc.next());
		char[] ch=s.toCharArray();
		int vowels=0;
		int consonent=0;
		int digit=0;
		int spe_char=0;
		int capital_letter=0;
		int small_letter=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z') || ch[i]>='0' && ch[i]<='9' )
			{
			    if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					vowels++;
				}
			    else
			    {
			    	consonent++;
			    }
			}
			else
			{
				spe_char++;
			}
			
			
		     if(ch[i]>='0' && ch[i]<='9')
			{
				digit++;
			}
		    if(ch[i]>='A' && ch[i]<='Z')
			{
				capital_letter++;
			}
		    if(ch[i]>='a' && ch[i]<='z')
			{
				small_letter++;
			}
		  
			
		}
		
		System.out.println("vowels : " + vowels);
		System.out.println("consonent : " + consonent);
		System.out.println("digit : " + digit);
		System.out.println("special characters : "+ spe_char);
		System.out.println("capital_letter : " + capital_letter);
		System.out.println("small_letter : " + small_letter);
	}

}
