package leetcode;

public class StockBuySell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0,MaxSoFar = 0;
		int k = 1;
		
		int[] prices = {1,2,3,0,1,2,6};
		
		while(k < prices.length)
		{
			if( (prices[k-1] > prices[k]) )
			{	
				if(k-i!=1)
			        MaxSoFar += (prices[k-1] - prices[i]);
			    i = k; 
			}			
			k++;
		}
		
		if((k - i) != 1)
		    MaxSoFar += (prices[k-1] - prices[i]);
		
        System.out.println(MaxSoFar);
        
	}

}
