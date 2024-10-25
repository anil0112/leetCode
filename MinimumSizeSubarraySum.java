package leetcode;

public class MinimumSizeSubarraySum {

	public static int minSubArrayLen(int target, int[] nums) {

		int high = 0;
		int low = 0;
		int minLenWindow = Integer.MAX_VALUE;
		int currentSum = 0;

		while (high < nums.length) {

			// Find the current sum and increase window size
			currentSum = currentSum + nums[high];
			high++;

			// Try to reduce the window size
			while (currentSum >= target) {
				int currentWindowSize = high - low;

				// Update minimum length of window
				minLenWindow = Math.min(minLenWindow, currentWindowSize);
				currentSum = currentSum - nums[low];
				low++;
			}
		}

		return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
	}

	public static void main(String[] args) {
		int target = 7;
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		System.out.println(minSubArrayLen(target, nums));

//		target = 4;
//		int[] nums2 = { 1, 4, 4 };
//		System.out.println(minSubArrayLen(target, nums2));
//
//		target = 11;
//		int[] nums3 = { 1, 1, 1, 1, 1, 1, 1, 1 };
//		System.out.println(minSubArrayLen(target, nums3));
	}

}
