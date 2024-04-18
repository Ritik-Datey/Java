package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindKthSmallestValue {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		
		int [] arr=new int [sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value " + (i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println("Please enter your kth value");
		int k=sc.nextInt();
		System.out.println(arr[k-1]);
	}

}
