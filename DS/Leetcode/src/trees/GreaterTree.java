package trees;

public class GreaterTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root  = new TreeNode(5);
			root.left  = new TreeNode(2);
			root.right = new TreeNode(13);
		
		TreeNode result = convertBST(root);
	}
	
	public static TreeNode convertBST(TreeNode root) {
        updateBST(root,0);
        return root;
    }
    public static int updateBST(TreeNode root, int highSum){
         if(root == null) return 0;
         /*if(root.left==null && root.right==null){
            root.val+= highSum;
         	highSum = root.val;
         }*/
         highSum = updateBST(root.right,highSum); //right subtree
         root.val+= highSum;           // root
         highSum = root.val;
         highSum = updateBST(root.left,highSum); // left subtree
         return highSum;
    }
}
