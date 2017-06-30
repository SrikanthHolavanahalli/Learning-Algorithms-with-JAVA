package arrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,1,3,4,3,5,2,6};
		int k = 3;
		//LinkedList<Integer> result = calSlidingWindowMax(k,input);
		//calSlidingWindowSum(k,input);
		calSlidingWindowAvg(k,input);
		int x = 1;
	}
	
	public static LinkedList<Integer> calSlidingWindowMax(int k , int[] input){
		if(k==0||input==null||input.length==0)
			return null;
		Deque<Integer> queue = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();
		
		for(int i = 0 ; i < input.length;i++){
			if(!queue.isEmpty() &&  queue.peek() < i-k+1)
				queue.poll();
			while(!queue.isEmpty() && input[i] > input[queue.peekLast()])
				queue.pollLast();
			queue.offer(i);
			if(i-k+1>=0)
				result.add(input[queue.peek()]);
		}
		return result;
	}
	
	public static void calSlidingWindowSum(int k , int[] input){
		if(k==0||input==null||input.length==0)
			return ;
		int sum =0;
		for(int i = 0 ; i < input.length;i++){
			if(i-k<0)
				sum+=input[i];
			else{
				System.out.print(sum + " ");
				sum += input[i] - input[i-k];
			}
		}
		System.out.print(sum + " ");
	}
	
	public static void calSlidingWindowAvg(int k , int[] input){
		if(k==0||input==null||input.length==0)
			return ;
		int sum =0,avg=0;
		for(int i = 0 ; i < k;i++){
			sum+=input[i];
		}
		avg = sum/k;
		for(int i = k ; i < input.length;i++){
				System.out.print(avg + " ");
				sum += input[i] - input[i-k];
				avg = sum/k;
		}
		System.out.print(avg + " ");
	}
}
