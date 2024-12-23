package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int[] arr= new int[sc.nextInt()];
		//insert value in array......
		for(int  i=0;i<arr.length;i++) {
			System.out.println("Enter value "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Given Array is : " +Arrays.toString(arr));
		//for sorting
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	  // Arrays.sort(arr);
		
	   System.out.println("Sorted Array is : " +Arrays.toString(arr));
	   
	   System.out.println("Min Value of Array is : "+ arr[0]);
	   System.out.println("Max Value of Array is : "+ arr[arr.length-1]);
	   
	   
	     
	   // In optimize way ............
	   
	   int min = arr[0];
	   int max = arr[0];
	   
	   for (int i = 1; i < arr.length; i++) {
           if (arr[i] < min) {
               min = arr[i];  // Update min
           }
           if (arr[i] > max) {
               max = arr[i];  // Update max
           }
       }
	   
	   System.out.println("Min : " + min);
	   System.out.println("Max : " + max);
		
	}

}
