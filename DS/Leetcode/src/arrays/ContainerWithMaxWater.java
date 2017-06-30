package arrays;

public class ContainerWithMaxWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,2,7,4,1,5};
		System.out.println(maxArea(input));
	}
	
	public static int maxArea(int[] height) {
		//if(height == null || height.length < 2) return 0;
        int left = 0, right = height.length-1, ans = Integer.MIN_VALUE,min=0;
        while(left < right){
            min = Math.min(height[left], height[right]);
            ans = Math.max(ans, min*(right-left));
            while (height[left]  <= min && left < right) left++;
            while (height[right] <= min && left < right) right--;
        }
        return ans;
	    }
	
	/*
	 int water = 0;
        int i = 0, j = height.size() - 1;
        while (i < j) {
            int h = min(height[i], height[j]);
            water = max(water, (j - i) * h);
            while (height[i] <= h && i < j) i++;
            while (height[j] <= h && i < j) j--;
        }
        return water;
	  */

}
