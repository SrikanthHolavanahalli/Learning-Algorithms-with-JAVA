package arrays;

public class MaximumRectangle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] input = {2,1,5,6,2,3};
			System.out.println(largestRectangleArea(input));
		}
	   public static int largestRectangleArea(int[] heights) {
	        int n = heights.length;
	        if(n==0)
	            return 0;
	        
	        int minValRight=Integer.MAX_VALUE,minIndexRight=n-1,minValLeft=Integer.MIN_VALUE,minIndexLeft=-1;
	        int[] minRight = new int[n];
	        int[] minLeft  = new int[n];
	        //finding ranges of each element being minimum in array
	        //right minimum
	        for(int i = n-1;i > -1; i--){
	            if(heights[i] < minValRight){
	                minRight[i]   = minIndexRight - i + 1;
	                minValRight   = heights[i];
	                minIndexRight = i;
	            }
	            else
	                minRight[i] = 1;
	        }
	        //left minimum
	        for(int i = 0;i < n; i++){
	            if(heights[i] < minValLeft){
	                minRight[i]  = i - minIndexLeft + 1;
	                minValLeft   = heights[i];
	                minIndexLeft = i;
	            }
	            else
	                minRight[i] = 1;
	        }
	        
	        int result = 0;
	        //find biggest rectangle from minimums
	        for(int i = 0; i < n; i++){
	            result = Math.max(result, (minRight[i] + minLeft[i] - 1)*heights[i]);
	        }
	        return result;
	}
}
