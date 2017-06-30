package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianFinder m = new MedianFinder();
		m.addNum(1);
		m.addNum(2);
		System.out.println(m.findMedian());
		m.addNum(3);
		System.out.println(m.findMedian());
	}

}

class MedianFinder {
    PriorityQueue<Integer> minHeap = null, maxHeap =null;
    
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>(10, Collections.reverseOrder());
        maxHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0)
            maxHeap.offer(num);
        else if(num > maxHeap.peek())
            maxHeap.offer(num);
        else
            minHeap.offer(num);
            
        if(minHeap.size() - maxHeap.size() > 1)
            maxHeap.offer(minHeap.poll());
        else if(maxHeap.size() - minHeap.size() > 1)
            minHeap.offer(maxHeap.poll());
    }
    
    public double findMedian() {
        if(minHeap.size() > maxHeap.size())
            return minHeap.peek();
        else if(minHeap.size() < maxHeap.size())
            return maxHeap.peek();
        else
            return (double)(minHeap.peek() + maxHeap.peek())/2;
    }
}
