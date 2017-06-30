package arrays;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,0,1,0,2,1,1,2,1,1,1,1,1};
		int[] input2 = {1,1,0,0,2,0,2};
		sortColors2(input2);
	}
	
	/*
    1.  Initialize 2 pointers - zeroPointer at 0, twoPointer at n-1
    2.  Loop from i = 0  till i <= twoPointer
        2a. if i == 0
                swap(i, zeroPointer++)
            else if i == 2
                // skips 2 from end until 0 or 1 found, in next iteration skips 1 or swaps 0
                swap(i--,twoPointer--) 
*/
	
	public static void sortColors2(int A[]) {
	    int j = 0,n = A.length, k = n-1;
	    for (int i=0; i <= k; i++) {
	    	System.out.println("i " + i + " zeroPointer: " + j  + " twoPointer: " +  k);
	        if (A[i] == 0)
	            swap(A,i,j++);
	        else if (A[i] == 2)
	            swap(A,i--, k--);
	        display(A);
	    }
	    return;
	}
	
	public static void display(int[] nums){
		for(int i = 0; i < nums.length;i++)
			System.out.print(nums[i] + " ");
		System.out.println(" ");
	}
	
	public static void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int zeroPointer = 0, onePointer = 0, n = nums.length;
        //while(zeroPointer < n && nums[zeroPointer++] !=0) ;
        while(onePointer < n  && nums[onePointer++]  !=1) ;
        onePointer--;
        if(zeroPointer >= n-1 || onePointer >= n-1){
            if(zeroPointer >=n-1 && onePointer >= n-1)
                return;
            else if(zeroPointer >= n-1)
                zeroPointer = onePointer;
            else 
                onePointer = zeroPointer;
        }
        for(int i = 0; i < n ; i++){
        	System.out.println("i " + i + " zeroPointer: " + zeroPointer  + " onePointer: " +  onePointer);
            if(nums[i] == 2){
                swap(nums,i,onePointer);
                while(onePointer < n  && nums[onePointer++]  !=1) ;
                onePointer--;
            }else if(nums[i] == 0){
                swap(nums, i , zeroPointer);
                zeroPointer++;
            }
        }
        return;
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]  = nums[b];
        nums[b]  = temp;
    }
}