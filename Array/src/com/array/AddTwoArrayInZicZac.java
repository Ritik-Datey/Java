package com.array;

public class AddTwoArrayInZicZac {

	public static void main(String[] args) {

		int[] arr1= {1,3,2,4,6};
		int[] arr2= {9,6,2,6,4};
		
		int[]arr3=new int[arr1.length+arr2.length];
	
		int index1=0;
		int index2=0;
		
		for(int i=0;i<arr3.length;i++)
		{
			if(i%2==0) {
				arr3[i]=arr1[index1];
				index1++;
			}
			else
			{
				arr3[i]=arr2[index2];
				index2++;
			}
		}
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}

}
