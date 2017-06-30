package math;

public class SQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(1024));
	}
	
	 /*
	    Binary Search solution with low = 1, high = x
	    1. Start with low = 1, high = x
	    // Mathematically if low + 1 == high , then mid = low + 1/2 which is equal to mid, we got our answer
	    2. loop until low + 1 < high 
	        2a. mid = low + (high-low)/2
	        2b. if(mid > x/ mid) high = mid
	            else low = mid
	    //return floor value for sqrt
	    3. return low
	*/
	
	public static int mySqrt(int x) {
        if(x==0) return 0;
        int low = 1, high = x;
        while(low + 1< high){
            int mid = low + (high-low >> 1);
            if(mid > x / mid)  high = mid;
            else low = mid;
        }
        return low;
    }

}
