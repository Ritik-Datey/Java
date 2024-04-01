package com.array;

import java.util.Arrays;

public class FindMaxAndMin {

	public static void main(String[] args) {

		long[] arr= {1,2,33,4334,55,234234,22352,2424};
		Arrays.sort(arr);
		long minimum=arr[0];
		long maximum=arr[arr.length-1];
		
		System.out.println(minimum);
		System.out.println(maximum);
	}

}
