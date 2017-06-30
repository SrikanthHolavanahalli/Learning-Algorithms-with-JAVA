package arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestContigousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {-2,1,-3,4,-1,2,1,-5,4};
		List<Integer> input = new ArrayList<>();
		for(int i : input1)
			input.add(i);
		System.out.println(maxSubArray(input));
	}
	
	public static int maxSubArray(final List<Integer> list) {
	   /* if(list == null || list.size() == 0)
	        return 0;
	    int result=Integer.MIN_VALUE, maxSoFar=0;
        for(int i = 0; i< list.size(); i++){
        	maxSoFar += list.get(i);
            if(maxSoFar > result)
            	result = maxSoFar;
            if(maxSoFar < 0)
                maxSoFar = list.get(i);
        }
        return result;*/
		
		int max_so_far = list.get(0), curr_max = list.get(0);
		 
		   for (int i = 1; i < list.size(); i++){
		        curr_max = Math.max(list.get(i), curr_max+ list.get(i));
		        max_so_far = Math.max(max_so_far, curr_max);
		   }
		   return max_so_far;        
	}
}
