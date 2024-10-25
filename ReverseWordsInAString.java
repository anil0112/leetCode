package leetcode;

public class ReverseWordsInAString {
	
	public static String reverseWords(String s) {
		String[] words = s.split(" +");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0 ; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		
		
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
		
		s = "  hello world  ";
		System.out.println(reverseWords(s));
		
		s = "a good   example";
		System.out.println(reverseWords(s));
		
	}

}
