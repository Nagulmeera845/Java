package Important_Programs;

import java.util.Arrays;

public class AscendingOrder_elements {
	public static void main(String[] args) {
		int arr[]= {22,15,9,84,4};
		/*
		 * we can declare and intialise array inthis way also
		 * int arr[]=new int[] {22,59,51,87,5};
		 */
      	System.out.println("Array length: "+arr.length);
		
		Arrays.sort(arr);
//here we didn't print Array directly so we are converting to string
		System.out.println(Arrays.toString(arr));
	}
 }
