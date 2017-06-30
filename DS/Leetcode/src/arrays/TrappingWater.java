package arrays;

import java.util.Stack;

public class TrappingWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,7,1,2,4,2,2,7};
		System.out.println(trap(input));
	}
	
	public static int trap(int[] A){
	    int a=0;
	    int b=A.length-1;
	    int max=0;
	    int leftmax=0;
	    int rightmax=0;
	    while(a<=b){
	        leftmax=Math.max(leftmax,A[a]);
	        rightmax=Math.max(rightmax,A[b]);
	        if(leftmax<rightmax){
	            max+=(leftmax-A[a]);       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
	            a++;
	        }
	        else{
	            max+=(rightmax-A[b]);
	            b--;
	        }
	        
	        System.out.println("max:" + max + " a:" + a + " b:" + b);
	    }
	    return max;
 	}
	
	 public static int trap1(int[] height) {
	        if(height==null||height.length<=2)
	            return 0;
	    
	        int n = height.length, result = 0, element = height[n-1], wall = 0, k = n-1;
	        int [] rainWater = new int[n];
	        Stack<Element> stack = new Stack<>();
	        
	        stack.push(new Element(n-1,height[n-1]));
	        rainWater[n-1]=0;
	        Element e = new Element();
	        for(int i = n - 2 ; i >= 0; i--){
	            element = height[i];
	            wall=0; 
	            if(stack.peek().val < element){
	                while(!stack.empty() && stack.peek().val < element){
	                    e = stack.pop();
	                    wall = wall - e.val - rainWater[e.index];
	                    
	                }
	                if(!stack.empty()){
	                    result += (stack.peek().index - (i + 1))*element + wall;
	                    rainWater[i] = result;
	                }
	            }
	            else{
	                rainWater[i] = 0;
	            }
	            stack.push(new Element(i,height[i]));
	        }
	        return result;
	    }

}

class Element{
    int index=-1;
    int val=0;
    
    public Element(int idx, int value){
        this.index = idx;
        this.val = value;
    }
    
    public Element(){
        index = -1;
        val =0;
    }
}