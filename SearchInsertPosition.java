package leetcode;

//Binary Search
public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (nums[mid] > target ) {
				end = mid-1;
			} else {
				start = mid+1;
				
			}
		}

		return start;
	}

	public static void main(String[] args) {
		
		int[] nums1 = {1,3,5,6}; 
		int target = 5;
		System.out.println(searchInsert(nums1, target));
		//Output: 2
				

	int[] nums2 = {1,3,5,6}; 
	 target = 2;
	 System.out.println(searchInsert(nums2, target));
	//Output: 1

	int[] nums3 = {1,3,5,6};
	target = 7;
	System.out.println(searchInsert(nums3, target));
	//Output: 4

	}

}
