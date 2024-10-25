package leetcode;

class Solution {
	
	//int nums1[] = { 1, 2, 3, 0, 0, 0 };
	//int m = 3;
	//int nums2[] = { 2, 5, 6 };

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1; // max index of first array
		int j = n - 1; //  max index of second array

		int k = m + n - 1; // max index  of entire merge array

		while (j >= 0) {
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				k--;
				i--;
			} else {
				nums1[k] = nums2[j];
				k--;
				j--;
			}

		}

	}
}

public class MergeSortedArray_two_pointer {
	
	public static void main(String[] args) {
		
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 2, 5, 6 };
		int n = 3;
		
		new Solution().merge(nums1, m, nums2, n);
		for(int element : nums1) {
			System.out.print(element);
		}
		
	}

}
