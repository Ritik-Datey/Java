package com.array;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[]= {9,6,8,5,7,4,2,3,1};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int a: arr)
		{
			System.out.print(a+ " ");
		}
	}

}
