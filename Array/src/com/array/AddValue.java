package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class AddValue {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the size of array");
		
		int[] value=new int[sc.nextInt()];
		
		for(int i=0;i<value.length;i++)
		{
			System.out.println("Enter value " + (i+1));
			int temp=sc.nextInt();
			value[i]=temp;
		}
		System.out.println(Arrays.toString(value));
	}

}
