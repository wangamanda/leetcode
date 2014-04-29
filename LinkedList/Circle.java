package LinkedList;

public class Circle{

	public static ListNode n1 = new ListNode(1);
	public static ListNode n2 = new ListNode(2);
	public static ListNode n3 = new ListNode(3);
	public static ListNode n4 = new ListNode(4);
	public static ListNode n5 = new ListNode(5);
	public static ListNode n6 = new ListNode(6);
	public static void main(String[] args){
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n3;

		ListNode head = FindHead(n1);
		System.out.println(head.val+"");
	}

	public static ListNode FindHead(ListNode n){
		if(n == null || n.next == null){
			return n;
		}

		ListNode former = n;
		ListNode current = n;
		while(former != null && former.next != null){
			former = former.next.next;
			current = current.next;
			if(former == current){
				break;
			}
		}

		if(former == null || former.next == null){
			return null;
		}

		current = n;
		while(former != current){
			former = former.next;
			current = current.next;
		}
		
		return current;
	}	
}
