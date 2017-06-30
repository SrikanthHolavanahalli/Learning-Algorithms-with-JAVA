package dp;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> input  = new ArrayList<List<Integer>>();
		//List<I>
	}
	
	public static int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;
        if(triangle==null || triangle.size() == 0)
            return 0;
        result += triangle.get(0).get(0);
        int minIndex = 0;
        for(int i = 1; i < triangle.size();i++){
            if(minIndex > 0)
                minIndex = Math.min(triangle.get(i).get(minIndex),triangle.get(i).get(minIndex-1));
            if(minIndex < triangle.get(0).size())
                minIndex = Math.min(triangle.get(i).get(minIndex),triangle.get(i).get(minIndex+1));
                
            result+= triangle.get(i).get(minIndex);
        }
        return result;
    }
}
