package java_array_utils;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String args[]) {
		int[] arr = {1, 2 , 2, 3, 1, 5, 3, 1};
		int[] uniqueNumbers = Arrays.stream(arr)
				.distinct()
				.toArray();
		for (int i : uniqueNumbers)
		System.out.print(" -> " +i );
	}
}
