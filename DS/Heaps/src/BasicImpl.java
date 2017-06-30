import java.util.*;

public class BasicImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 
		
		Integer [][] matrix = new Integer [][] {
										  { 1,  5,  9},
								          {10, 11, 13},
								          {12, 13, 15}
		};
		
		 for(Integer[] row : matrix)
	        {
	            for(int col : row)
	            {
	                pq.offer(col);
	            }
	        }
		 
		 System.out.println("pq: " + pq);
		 
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
 
		// use offer() method to add elements to the PriorityQueue pq1
		for (int x : ia) {
			pq1.offer(x);
		}
 
		System.out.println("pq1: " + pq1);
		
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,Collections.reverseOrder());
		
		for (int x : ia) {
			pq2.offer(x);
		}
 
		System.out.println("pq2: " + pq2);
 
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element in the queue without removing it
		System.out.println("peek: " + pq2.peek());
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element and removes it from the queue
		System.out.println("poll: " + pq2.poll());
		// print size
		System.out.println("size: " + pq2.size());
 
		System.out.print("pq2: " + pq2);
		 
		
	}

}
