package com.srd;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		String[] s=new String[sc.nextInt()];
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter name " + (i+1) );
			s[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(s));
		
		//Acceending Order 
				System.out.println("In Accending Order");
				
				for(int i=0;i<s.length;i++)
				{
					for(int j=i+1;j<s.length;j++)
					{
						if(s[i].compareTo(s[j])>0)
						{
							String temp=s[i];
							s[i]=s[j];
							s[j]=temp;
						}
					}
				}
				
				System.out.println(Arrays.toString(s));
				
			//Decceending Order 
				System.out.println("In Deccending Order");
				
						for(int i=0;i<s.length;i++)
						{
							for(int j=i+1;j<s.length;j++)
							{
								if(s[i].compareTo(s[j])<0)
								{
									String temp=s[i];
									s[i]=s[j];
									s[j]=temp;
								}
							}
						}
						
						System.out.println(Arrays.toString(s));
				

	}

}
