package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/count-pairs-of-similar-strings/description/

//Input: words = ["aabb","ab","ba"]
//Output: 3

//Input: words = ["nba","cba","dba"]
//Output: 0

class CountPairOfSimilarString {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                count+=check(words[i],words[j]);
            }
        }
        return count;
    }
    
    public int similarPairs(List<String> words) {
        int count=0;
        for(int i=0;i<words.size()-1;i++)
        {
            for(int j=i+1;j<words.size();j++)
            {
                count+=check(words.get(i),words.get(j));
            }
        }
        return count;
    }

    private int check(String a,String b)
    {
        HashSet<Character> aset=new HashSet();
        for(char ch:a.toCharArray())
            aset.add(ch);

        HashSet<Character> bset=new HashSet();
        for(char ch:b.toCharArray())
            bset.add(ch);
        return aset.equals(bset)?1:0;
    }
    
    public static void main(String[] args) {
    	String words[] = {"aabb","ab","ba"};
    	int pair = new CountPairOfSimilarString().similarPairs(words);
    	
    	System.out.println(pair);
    	
    	String words2[]  = {"nba","cba","dba"};
    	 pair = new CountPairOfSimilarString().similarPairs(words2);
    	
    	System.out.println(pair);
    	
    	List<String> words3 = Arrays.asList("aabb","ab","ba");
    	 pair = new CountPairOfSimilarString().similarPairs(words);
    	
    	System.out.println(pair);
    	
    	List<String> words4 = Arrays.asList("nba","cba","dba");
    	 pair = new CountPairOfSimilarString().similarPairs(words2);
    	
    	System.out.println(pair);
    	
	}
}