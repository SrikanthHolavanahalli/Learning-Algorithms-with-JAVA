package heaps;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		
		//Min-Heap
		PriorityQueue<Integer> pqMinHeap = new PriorityQueue<Integer>();
		//Max-Heap
		PriorityQueue<Integer> pqMaxHeap = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		
		//Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] a = new int[input.length];
        for(int a_i=0; a_i < input.length; a_i++){
            a[a_i] = input[a_i];
            
            if(a_i==0){
            	pqMinHeap.offer(a[a_i]);
            	System.out.printf("%.1f",(float)a[a_i]);
            }else{
            	if(a[a_i] < pqMinHeap.peek()){
            		pqMaxHeap.offer(a[a_i]);
            		if(pqMaxHeap.size() - pqMinHeap.size() > 1)
            			pqMinHeap.offer(pqMaxHeap.poll());
            		
            	}else{
            		pqMinHeap.offer(a[a_i]);
            		if(pqMaxHeap.size() - pqMinHeap.size() < 0)
            			pqMaxHeap.offer(pqMinHeap.poll());
            	}
            	if(pqMaxHeap.size() > pqMinHeap.size() )
            		System.out.printf("%.1f",(float)pqMaxHeap.peek());
            	else if(pqMaxHeap.size() < pqMinHeap.size())
            		System.out.printf("%.1f",(float)pqMinHeap.peek());
            	else
            	System.out.printf("%.1f",(float)(pqMaxHeap.peek() + pqMinHeap.peek())/2);
            }
            System.out.println("");
        }
	}
}
