package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithAtleastKRepChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String allChars = "abcdefghijklmnopqrstuvxyz";
		System.out.println(longestSubstring("aaabbddf",3) + " " + count+ " " + recr);
		
		allChars.equals("");
		
		int x = 10;
		
		//short y = x;
	}
	
	static int count = 0;
	static int recr  = 0;
	public static int longestSubstring(String s, int k) {
		 HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
		 recr++;
		
		    for(int i=0; i<s.length(); i++){
		 
		        char c = s.charAt(i);
		        if(counter.containsKey(c)){
		            counter.put(c, counter.get(c)+1);
		        }else{
		            counter.put(c, 1);
		        }
		 
		    }
		 
		    HashSet<Character> splitSet = new HashSet<Character>();
		    for(char c: counter.keySet()){
		        if(counter.get(c)<k){
		            splitSet.add(c);
		        }
		    }
		 
		    if(splitSet.isEmpty()){
		        return s.length();
		    }
		 
		    int max = 0;
		    int i=0, j=0;
		    while(j<s.length()){
		    	 count++;
		        char c = s.charAt(j);
		        if(splitSet.contains(c)){
		            if(j!=i){
		                max = Math.max(max, longestSubstring(s.substring(i, j), k));
		            }
		            i=j+1;
		        }
		        j++;
		    }
		 
		    if(i!=j)
		         max = Math.max(max, longestSubstring(s.substring(i, j), k));
		 
		    return max;
    }

}
