package leetcode;

public class H_Index_274 {

	public static int hIndex(int[] citations) {
		int n = citations.length;
		int[] buckets = new int[n + 1];
		for (int c : citations) {
			if (c >= n) {
				buckets[n]++;
			} else {
				buckets[c]++;
			}
		}
		int count = 0;
		for (int i = n; i >= 0; i--) {
			count += buckets[i];
			if (count >= i) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		int citations[]  = {3,0,6,1,5};
		int h = hIndex(citations);
		System.out.println(h);

	}

}
