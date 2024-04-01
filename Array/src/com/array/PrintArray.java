package com.array;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {

		int[] value= {1,2,3,4,5,6};
		
		System.out.println(value);
		
		for(int i=0;i<=value.length;i++)
		{
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(value));
	}

}
