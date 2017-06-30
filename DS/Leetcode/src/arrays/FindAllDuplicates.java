package arrays;

import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,3,2,7,8,2,3,1};
		
		List<Integer> test = findDuplicates(nums);
		
	}
	
public static List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new LinkedList<Integer>();
        
        int k = nums.length;
        
        for(int m = 0; m < k; m++)
        	nums[m]--;
    
        for(int i = 0; i < k; i++)
        {
           nums[(nums[i] % k)] = nums[(nums[i] % k)] + k;
        }
        
         for(int j = 0; j < k; j++)
        {
            if((nums[j] / k) == 2)
                result.add(j+1);
        }
        
        return result;
    }

}
