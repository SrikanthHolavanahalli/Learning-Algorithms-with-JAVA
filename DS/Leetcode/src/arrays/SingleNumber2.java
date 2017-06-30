package arrays;

public class SingleNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,1,1,3,7,7,7};
		System.out.println(singleNumber(input));
		
	}
	
	public static int singleNumber(int[] A) {
	    int ones = 0, twos = 0;
	    for(int i = 0; i < A.length; i++){
	    	System.out.println(~twos);
	        ones = (ones ^ A[i]) & ~twos;
	        System.out.println(~ones);
	        twos = (twos ^ A[i]) & ~ones;
	    }
	    return ones;
	}

}
