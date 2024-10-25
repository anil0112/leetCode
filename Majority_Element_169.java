package leetcode;

public class Majority_Element_169 {

	public static int majorityElement(int[] nums) {

		int majority = nums[0];
		int votes = 1;
		for (int i = 1; i < nums.length; i++) {
			if (votes == 0) {
				majority = nums[i];
			}
			 if (majority == nums[i]) {
				 votes++;
			} else {
				votes--;
			}

		}

		return majority;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
		
		
		int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums2));
	}

}
