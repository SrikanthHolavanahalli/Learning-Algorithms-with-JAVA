package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(isAnagram("ape","tea"));
		System.out.println(isAnagram2("ape","tea"));
	}
	
	 public static boolean isAnagram(String s, String t) {
	        if(s==null||t==null||s.length() != t.length())
	            return false;
	         int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
	        int key=1;
	        s = s.toLowerCase();
	        for(int i = 0; i < s.length(); i++){
	            key *= prime[s.charAt(i) - 'a'];
	        }
	        t = t.toLowerCase();
	        for(int i = 0; i < t.length() && key > 1; i++){
	            key /= prime[t.charAt(i) - 'a'];
	        }
	        return key == 1?true:false;
	    }
	 
	 public static boolean isAnagram2(String s, String t) {
	        if(s==null||t==null||s.length() != t.length())
	            return false;
	        
	        Map<Character, Integer> map = new HashMap<>();
	        for(int i = 0; i < s.length(); i++){
	            if(map.get(s.charAt(i))==null){
	                map.put(s.charAt(i),1);
	            }else{
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }
	        }
	        for(int i = 0; i < t.length(); i++){
	            if(map.get(t.charAt(i))==null){
	               return false;
	            }else{
	                map.put(t.charAt(i),map.get(t.charAt(i))-1);
	                if(map.get(t.charAt(i)) == 0)
	                    map.remove(t.charAt(i));
	            }
	        }
	        return map.size()==0?true:false;
	    }

}
