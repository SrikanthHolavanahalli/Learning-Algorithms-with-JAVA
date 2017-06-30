package strings;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(romanToInt("MCCLX"));
	}
	
	 public static int romanToInt(String s) {
	        if(s==null||s.length() ==0){
	            return 0;
	        }
	        HashMap<Character, Integer> hm = new HashMap<>();
	        hm.put('I',1);        hm.put('V',5);
	        hm.put('X',10);       hm.put('L',50);
	        hm.put('C',100);      hm.put('D',500);
	        hm.put('M',1000);
	        
	        int result = 0;
	        for(int i = 0; i < s.length();i++){
	            if(i < s.length() - 1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i+1)))
	                result -= hm.get(s.charAt(i));
	            else
	                result += hm.get(s.charAt(i));
	        }
	        return result;
	}

}
