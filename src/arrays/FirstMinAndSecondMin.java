package arrays;

public class FirstMinAndSecondMin {

	public static void main(String[] args) {

		int[] arr = {21,63,53,74,26,94,77,76};
		
		int firstMin=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0; i< arr.length;i++) {
			if(arr[i]<firstMin) {
				secondMin = firstMin;
				firstMin=arr[i];
			}
			if(arr[i] < secondMin && arr[i] != firstMin) {
				secondMin=arr[i];
			}
			
		}
		
		
		if(secondMin == Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(firstMin + " " + secondMin);
		}
		
		
	}

}
