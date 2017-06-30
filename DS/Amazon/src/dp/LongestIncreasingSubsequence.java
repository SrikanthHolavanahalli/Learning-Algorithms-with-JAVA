package dp;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,3,6,7,9,4,10,5,6};
		int[] input2 = {10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(lengthOfLIS(input));
	}
	
	public static int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        
        // This will be our array to track longest sequence length
     	int T[] = new int[nums.length];

     	// Fill each position with value 1 in the array
     	for(int i=0; i < nums.length; i++)
     		T[i] = 1;
 
        int result = 0;
        for(int i = 1; i < nums.length; i++){
            for(int j = i-1; j >=0 ; j--){
                if(nums[i] > nums[j]){
                   T[i] = Math.max(T[i], T[j]+1);
                }
            }
            result = Math.max(result,T[i]);
        }
        return result;
    }
}
