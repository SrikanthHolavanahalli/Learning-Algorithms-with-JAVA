import java.util.*;


public class KthSmallestIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		
	}
	
	public int kthSmallestMyImpl(int[][] matrix, int k)
	{
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        
	        for(int[] row : matrix)
	        {
	            for(int col : row)
	            {
	               pq.offer(col); 
	            }
	        }
	        
	        int i = 1;
	        
	        while( i < k) // needs to run for k-1 elements
	        {
	            pq.poll();
	            i++;
	        }
	        
	        return pq.poll();
	        
	    
	}
	
	
	public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for(int j = 0; j <= n-1; j++) pq.offer(new Tuple(0, j, matrix[0][j]));
        for(int i = 0; i < k-1; i++) {
            Tuple t = pq.poll();
            if(t.x == n-1) continue;
            pq.offer(new Tuple(t.x+1, t.y, matrix[t.x+1][t.y]));
        }
        return pq.poll().val;
    }
	

}

class Tuple implements Comparable<Tuple> {
    int x, y, val;
    public Tuple (int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
    
    @Override
    public int compareTo (Tuple that) {
        return this.val - that.val;
    }
}
