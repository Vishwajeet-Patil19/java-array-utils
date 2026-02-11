package java_array_utils;

public class FindMissingNumber {

	static int findMissingNumber(int[] nums) {
		int n = nums.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : nums) actualSum += num;
		return expectedSum - actualSum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 7};
		System.out.println(findMissingNumber(nums));
	}
}
