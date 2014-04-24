package LinkedList;

import java.util.Arrays;

public class ReverseKGroup{
	ListNode n1 = new ListNode(1);
	ListNode n2 = new ListNode(2);
	ListNode n3 = new ListNode(3);
	ListNode n4 = new ListNode(4);
	ListNode n5 = new ListNode(5);
	public static void main(String[] args){
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		ListNode n = Reverse(n1, 2)
		while(n != null){
			System.out.print(n.val);
			n = n.next;
		}
		System.out.println();
	}

	public static ListNode Reverse(ListNode head, int k){
		int t = 0;
		if(head == null){
			return null;
		}

		ListNode cur = head.next;
		ListNode former = head;
		while(cur != null){
			if(t != k){
				former.next = cur.next;
				cur.next = head;
				head = cur;

				t ++ ;
			}else{
				t = 0;
			}
		}
	}
}
