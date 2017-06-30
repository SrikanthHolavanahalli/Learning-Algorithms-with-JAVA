package leetcode;

public class StockBuySell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] A = {7, 6, 4, 3, 1};
		
		int i = 0,MaxSoFar = 0;
		
		int k = 0;
		while(k < A.length)
		{
			if(A[i] >= A[k])
				i = k;
			else
			{
				if((A[k] - A[i]) > MaxSoFar)
					MaxSoFar = (A[k] - A[i]);
			}
			
			k++;
		}
		
		
		System.out.println(MaxSoFar);
	}

}
