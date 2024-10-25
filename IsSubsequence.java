package leetcode;

public class IsSubsequence {

	public static boolean isSubsequence(String s, String t) {
		
		int i =0; 
		int j= 0;
		
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)== t.charAt(j)) {
				i++;
				j++;
			}else {
				j++;
			}
			
		}
		if(i == s.length()) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		
		System.out.println(isSubsequence(s, t));
		
		s = "axc"; t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
}
