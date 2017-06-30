import java.util.ArrayList;
import java.util.LinkedList;

public class SlidingWindowSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l =new ArrayList<Integer>();
	    l.add(5);
	    l.add(8);
	    l.add(9);
	    l.add(3);
	    l.add(4);
	    l.add(1);
	    int k=3;
	    int[] sum=new int[l.size()-k+1];
	    
	    for(int i = 0; i < k ;i++)
	    	sum[0]+= l.get(i);
	    
	    for(int j = 1; j <= l.size() - k ; j++)
	    	sum[j] = sum[j-1] + l.get(j+k - 1) - l.get(j-1);
	    
	    for(int i = 0; i < sum.length ;i++)
	    	System.out.println(" " + sum[i]);
	    
	}

}
