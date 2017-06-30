package linkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(0);
		TreeNode tail = head;
		head.add(tail, 1);
		tail = tail.next;
		head.add(tail, 2);
		tail = tail.next;
		head.add(tail, 3);
		tail = tail.next;
		head.add(tail, 4);
		tail = tail.next;
		head.add(tail, 5);
		tail = tail.next;	
		
		TreeNode revHead = reverse(head);
		revHead.display(revHead);
	}
	
	public static TreeNode reverse(TreeNode head){
		TreeNode prev = null, curr = head, fast = head.next ;
		while(fast!=null){
			curr.next = prev;
			prev = curr;
			curr = fast;
			fast = fast.next;
		}
		curr.next = prev;		
		return curr;
	}
}
