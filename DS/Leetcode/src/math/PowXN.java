package math;

public class PowXN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(1.334,3));
		System.out.println(myPow2(1.334,3));
	}
	
	public static double myPow(double x, int n) { 
	    if(n==0) return 1;
	    if(n<0){
	        n = -n;
	        x = 1/x;
	    }
	    return n%2==0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
	}
	
	public static double myPow2(double x, int n) { 
	    if(n==0) return 1;
	    if(n<0) {
	        n = -n;
	        x = 1/x;
	    }
	    double ans = 1;
	    while(n>0){
	    	//System.out.println((n&1));
	    	if(n%2==1) ans *= x;
	        x *= x;
	        n /=2;
	    }
	    return ans;
	}

}
