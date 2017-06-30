package linkedList;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(0);
		TreeNode tail = new TreeNode(1);
		head.next = tail;
		deleteNode(head);
	}
	
	 public static void deleteNode(TreeNode node) {
	        if(node==null)
	            return;
	        else if(node.next ==null) {
	            node=null;
	        }else{
	        	TreeNode curr = node;
	            while(curr.next!=null){
	                curr.val = curr.next.val;
	                curr = curr.next;
	            }
	            curr = null;
	        }
	    }

}
