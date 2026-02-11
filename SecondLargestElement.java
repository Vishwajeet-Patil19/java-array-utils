package java_array_utils;

import java.util.Arrays;

public class SecondLargestElement {

	static int getSecondLargest(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] != arr[n - 1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int[] arr = {1, 5 , 12, 35, 1, 10, 34, 1};
		System.out.println(getSecondLargest(arr));
	}
}
