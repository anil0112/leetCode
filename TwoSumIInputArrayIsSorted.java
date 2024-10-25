package leetcode;

import java.util.Arrays;

public class TwoSumIInputArrayIsSorted {
	
	public static int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end = numbers.length-1;

        while(start < end){
            if(numbers[start] + numbers[end] > target){
                end--;
            }
            else if(numbers[start] + numbers[end] < target){
                start++;
            }
            else{
                return new int[]{start+1,end+1};
            }
        }

        return new int[]{};
    }
	
	public static void main(String[] args) {
		
		int numbers[] = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
		
		 int numbers1[] = {2,3,4};
		 target = 6;
		 System.out.println(Arrays.toString(twoSum(numbers1, target)));
		
		int numbers2[] = {-1,0}; 
		target = -1;
		System.out.println(Arrays.toString(twoSum(numbers2, target)));
		
	}

}
