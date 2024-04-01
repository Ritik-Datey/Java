package com.array;

import java.util.Arrays;

public class AddTwoArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,3,2,4,6};
		int[] arr2= {9,6,2,6,4,5};
		
		int[]arr3=new int[arr1.length+arr2.length];
		int index=0;
		
		for(int i=0;i<arr1.length;i++) {
			arr3[index]=arr1[i];
			index++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[index]=arr2[i];
			index++;
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
