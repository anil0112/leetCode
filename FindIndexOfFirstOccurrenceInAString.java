package leetcode;

public class FindIndexOfFirstOccurrenceInAString {

	public static int fndIndexOfFirstOccurrenceInAString(String haystack, String needle) {

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

			if (haystack.charAt(i) == needle.charAt(0)) {
				if (haystack.substring(i, i + needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";

		System.out.println(fndIndexOfFirstOccurrenceInAString(haystack, needle));
		haystack = "leetcode";
		needle = "leeto";
		System.out.println(fndIndexOfFirstOccurrenceInAString(haystack, needle));
	}

}
