package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String s1 = strs[0];
		String s2 = strs[strs.length - 1];
		String commonPrifix = "";

		for (int i = 0; i < s1.length();) {
			if (s1.charAt(i) == s2.charAt(i)) {
				i++;
			} else {
				break;
			}
			commonPrifix =  i == 0 ? "" : s1.substring(0, i);
		}
		return commonPrifix;

	}

	public static void main(String[] args) {

		String[] strArr = { "flaow", "flaower", "flaour", "flavour" };
		System.out.println(longestCommonPrefix(strArr));

	}

}
