package leetcode;

import java.util.Arrays;

public class RotateArray {

	public static int[] rotateArray(int num[], int k) {
		int size = num.length;
		if(k > size) {
			k = k % size;
		}
		
		reverse(num, 0 , size-1);
		reverse(num, 0 , k-1);
		reverse(num, k , size-1);
		return num;
	}

	private static void reverse(int[] num, int start, int end) {
		
		while(start <= end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start ++;
			end --;
		}
		
	}
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7};
		int num2[] = {1,2,3};
		System.out.println(Arrays.toString(rotateArray(num,3)));
		System.out.println(Arrays.toString(rotateArray(num2,4)));
	}

}
