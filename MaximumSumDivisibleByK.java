package leetcode;

import java.util.HashMap;

public class MaximumSumDivisibleByK {

	public static int subarraysDivByK(int[] nums, int k) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int running_sum = 0;
		int count = 0;
		hm.put(0, 1);
		for (int i : nums) {
			running_sum = (i + running_sum) % k;
			if (running_sum < 0) {
				running_sum += k;
			}
			if (hm.containsKey(running_sum)) {
				count += hm.get(running_sum);

			}
			hm.put(running_sum, hm.getOrDefault(running_sum, 0) + 1);
		}
		return count;

	}

	public static void main(String[] args) {
		int nums[] = { 4, 5, 0, -2, -3, 1 }, k = 5;

		System.out.println(subarraysDivByK(nums, k));
	}
}
