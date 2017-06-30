package array;

import java.util.HashMap;
import java.util.Iterator;

public class BinaryPalind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(6));
		
		HashMap<Integer,Integer> hm= null;
		Iterator<String> i;
	}
	
	 private static Integer solve(int valueToFind) {
	        Integer result = null;
	         if(valueToFind==0)
	            return 1;
	        int temp = valueToFind;
	        StringBuilder sb = new StringBuilder();
	        while(temp > 0){
	            sb.append(temp&1);
	            temp >>= 1;
	        }
	        if(Integer.parseInt(sb.toString(),2) == valueToFind)
	            return 1;
	        else
	            return 0;
	        
	       // return result;
	    }

}
