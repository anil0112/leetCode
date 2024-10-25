package leetcode;

import java.util.HashMap;

public class ContainsDuplicate_217 {

	public static boolean containsDuplicate(int[] nums) {

		HashMap<Integer, Integer> hs = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (hs.containsKey(nums[i])) {
				return true;
			} else {
				hs.put(nums[i], i);
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,1};
		boolean isContainsDuplicate = containsDuplicate(nums);
		System.out.println(isContainsDuplicate);
		
		int [] nums2 = {1,2,3,4};
		boolean isContainsDuplicate2 = containsDuplicate(nums2);
		System.out.println(isContainsDuplicate2);
		
		int [] nums3 = {1,1,1,3,3,4,3,2,4,2};
		boolean isContainsDuplicate3 = containsDuplicate(nums3);
		System.out.println(isContainsDuplicate3);
	}

}
