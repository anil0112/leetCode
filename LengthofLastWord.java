package leetcode;

public class LengthofLastWord {

	public static int lengthofLastWord(String s) {
		String s1 = s.trim();
		int count = 0;
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) != ' ') {
				count++;
				continue;

			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s1 = "   fly me   to   the moon ";
		String s2 = "luffy is still joyboy";
		System.out.println(lengthofLastWord(s1));
		System.out.println(lengthofLastWord(s2));
	}

}
