package com.array;

public class FindMedianSortedArrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] nums3=new int[nums1.length+nums2.length];
		double result=0;
		int index=0;
		 for(int i=0;i<nums1.length;i++)
	        {
	            nums3[index]=nums1[i];
	            index++;
	        }
		 for(int i=0;i<nums2.length;i++)
	        {
	            nums3[index]=nums2[i];
	            index++;
	        }
		 
		 if((nums3.length)%2!=0)
		 {
			 double inVal=((nums3.length)/2);
			 result=nums3[(int) inVal];
		 }
		 else {
			 double inVal1=((nums3.length)/2);
			 double inVal2=inVal1-1;
			 
			 double val=(double)(nums3[(int) inVal1]+nums3[(int) inVal2])/2;
			 System.out.println(val);
			 result=val;
		 }
	     return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums1= {1,2};
//		int[] nums2= {3,4};
		int[] nums1= {1,2};
		int[] nums2= {3};
		
		double value=FindMedianSortedArrays.findMedianSortedArrays(nums1, nums2);
		System.out.println(value);
	}

}
