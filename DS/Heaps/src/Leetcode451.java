
import java.util.*;

// sort freq of characters in a string
public class Leetcode451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aAbb";
		
		HashMap <Character, Integer> hm = new HashMap<>();
		
		for(Character c: input.toCharArray())
		{
			if(hm.get(c) == null)
				hm.put(c, 1);
			else
				hm.put(c, hm.get(c) + 1);
		}
		
		List<charCount> allChars = new ArrayList<>();
		
		for(Character c : hm.keySet())
		{
			allChars.add(new charCount (c, hm.get(c)));
		}
		
		
		PriorityQueue<charCount> pq = new PriorityQueue<charCount>(10,Collections.reverseOrder());
		
		for(charCount cc : allChars)
		{
			pq.offer(cc);
		}
		
		String output = "";
		
		while(pq.size() > 0)
		{
			charCount cc = pq.poll();
			
			int z = cc.count;
			while( z > 0)
			{
				output += cc.c;
				z--;
			}
				
				
		}
		
		System.out.println(output);
	}

}


class charCount implements Comparable<charCount>{
	Character c ;
	
	Integer   count;
	
	public charCount(Character c, Integer count)
	{
		this.c = c;
		this.count = count;
	}
	
	
	@Override
	public int compareTo(charCount that) {
		// TODO Auto-generated method stub
		return this.count - that.count;
	}

	
}
