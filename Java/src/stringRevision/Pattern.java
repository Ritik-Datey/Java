package com.srd;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int x=5;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=x-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
