package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(5);
		root.add(root, true, 4);
		root.add(root.left, true, 11);
		root.add(root.left.left, true, 7);
		root.add(root.left.left, false, 2);
		
		root.add(root, false, 8);
		root.add(root.right, true, 13);
		root.add(root.right, false, 4);
		root.add(root.right.right, true, 5);
		root.add(root.right.right, false, 1);
		
		List<List<Integer>> result = pathSum(root,22);
	}
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> allSumPath = new ArrayList<List<Integer>>();
        if(root == null)
            return allSumPath;
        
        Stack<TreeNode> tree  = new Stack<TreeNode>();
        List<Integer> path = new ArrayList<Integer>();
        TreeNode n = null;
        
        int pathSum = 0;
        tree.push(root);
        path.add(root.val);
        pathSum += root.val;
      
        
        while(!tree.empty()){
        	
        	n = tree.pop();
        	if(n.left==null && n.right==null){
	        	if(pathSum == sum)
	                allSumPath.add(path); 
	        
	            path.remove(path.size()-1);
	            pathSum-=n.val;
        	}
        	
        	 if(n.right!=null){
                 tree.push(n.right); 
                 pathSum+=n.right.val;
                 path.add(n.right.val);
              }
        	 
        	 if(n.left!=null){
                 tree.push(n.left);
                 pathSum+=n.left.val;
                 path.add(n.left.val);
             }
        	 
        	 System.out.println(pathSum);
     
           /* n = tree.peek();
            if(n.left!=null){
                tree.push(n.left);
                pathSum+=n.left.val;
                path.add(n.left.val);
                n.left = null;
            }
            else{
                n = tree.pop();
                if(pathSum == sum)
                    allSumPath.add(path);
                
                path.remove(path.size()-1);
                pathSum-=n.val;
                
                if(n.right!=null){
                   tree.push(n.right); 
                   pathSum+=n.right.val;
                   path.add(n.right.val);
                   n.right = null;
                }
            }*/
        }
    return allSumPath;
    }

}

