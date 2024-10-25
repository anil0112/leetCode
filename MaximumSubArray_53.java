package leetcode;

//Kadane's Algorithm
public class MaximumSubArray_53 {

	public static int maxSubArray(int nums[]) {
		int maxSum = nums[0];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum > maxSum) {
				maxSum = sum;
			}
			 if (sum < 0) {
				sum = 0;

			}
		}

		return maxSum;
	}

	public static void main(String[] args) {

		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums1));
		// Output: 6
		// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
		int[] nums2 = { 1 };
		System.out.println(maxSubArray(nums2));
		// Output: 1
		// Explanation: The subarray [1] has the largest sum 1.
		int[] nums3 = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(nums3));
		// Output: 23
		// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
		
		int[] nums4 = {-3,-2,0,-1};
		System.out.println(maxSubArray(nums4));
		//output : 0
	}

}
