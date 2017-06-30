package intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1,4));
		intervals.add(new Interval(2,3));
		//intervals.add(new Interval(8,10));
		//intervals.add(new Interval(15,18));
		List<Interval> result = merge(intervals);
		System.out.println(result);
	}	
	 private static List<Interval> merge(List<Interval> intervals) {
	       if (intervals.size() <= 1)
	        return intervals;
		    // Sort by ascending starting point using an anonymous Comparator
		    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		    List<Interval> result = new LinkedList<Interval>();
		    int start = intervals.get(0).start;
		    int end = intervals.get(0).end;
		    for (Interval interval : intervals) {
		        if (interval.start <= end) // Overlapping intervals, move the end if needed
		            end = Math.max(end, interval.end);
		        else {                     // Disjoint intervals, add the previous one and reset bounds
		            result.add(new Interval(start, end));
		            start = interval.start;
		            end = interval.end;
		        }
		    }
		    // Add the last interval
		    result.add(new Interval(start, end));
		    return result;
	    }

	 
		
}
