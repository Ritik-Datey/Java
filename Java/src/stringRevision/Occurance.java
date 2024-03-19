package com.srd;
import java.util.Scanner;

public class Occurance 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		
		char[] ch1=new char[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
		  if(ch[i]!=0)
		  {
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=0;
				}	
			}
			System.out.println(ch[i] + " No. of Occurance is " + count);
		  }
		}
		
	}
}
