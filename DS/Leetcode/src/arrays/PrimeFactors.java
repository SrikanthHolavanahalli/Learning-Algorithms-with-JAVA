package arrays;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorize(315));
	}
	
	public static String factorize(int n){
		int temp = n;
		if(n <=2 )
			return Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		while( n %2 ==0){
			sb.append(2).append(" ");
			n /= 2;
		}
		for(int i = 3; i <= Math.sqrt(temp); i+=2){
			while(n > 1 && n % i ==0 ){
				sb.append(i).append(" ");
				n /= i;
			}
		}
		return sb.toString();
	}

}
