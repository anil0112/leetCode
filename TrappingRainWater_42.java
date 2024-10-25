package leetcode;

public class TrappingRainWater_42 {

	public static int trap(int[] height) {

		if (height.length <= 0) {
			return 0;
		}

		int n = height.length;
		int[] left = new int[n];
		int max = height[0];

		for (int i = 0; i < height.length; i++) {
			max = Math.max(max, height[i]);
			left[i] = max;
		}

		int right[] = new int[n];
		max = height[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			max = Math.max(max, height[i]);
			right[i] = max;
		}

		int totalWater = 0;
		for (int i = 0; i < n; i++) {
			totalWater = totalWater + Math.min(left[i], right[i]) - height[i];
		}
		return totalWater;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));
	}
}
