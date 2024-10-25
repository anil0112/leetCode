package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int req_num = target - nums[i];
			if (hm.containsKey(req_num)) {
				int num[] = { hm.get(req_num), i };
				return num;
			}
			hm.put(nums[i], i);
		}

		return null;
	}

	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
		//Output: [0,1]
		//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		int nums2[] = {3,2,4};
		 target = 6;
		 System.out.println(Arrays.toString(twoSum(nums2, target)));
		//Output: [1,2]
				

		int[] nums3 = {3,3};
		target = 6;
		System.out.println(Arrays.toString(twoSum(nums3, target)));
		//Output: [0,1]
				 
	}

}
