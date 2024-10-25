package leetcode;

public class JumpGame_55 {

	public static boolean canJump(int[] nums) {
		int finalPosition = nums.length - 1;

		for (int idx = nums.length - 2; idx >= 0; idx--) {
			System.out.println(idx);

			if (idx + nums[idx] >= finalPosition) {
				finalPosition = idx;
			}
		}

		return finalPosition == 0;
	}
	
	public static void main(String[] args) {
		int []nums1 = {2,3,1,1,4};
				
		int []nums2 = {3,2,1,0,4};
		
		//System.out.println(canJump(nums1));
		System.out.println(canJump(nums2));
	}

}
