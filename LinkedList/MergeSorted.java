package LinkedList;

import java.util.Arrays;

public class MergeSorted{
	public static void main(String[] args){
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(20);
		n1.next = n2;
		n2.next = n3;

		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(10);
		ListNode n6 = new ListNode(15);
		ListNode n7 = new ListNode(18);
		ListNode n8 = new ListNode(23);
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;

		ListNode n = Merge(n1, n4);
		while(n != null){
			System.out.println(n.val+"");
			n = n.next;
		}
	}

	public static ListNode Merge(ListNode h1, ListNode h2){
		ListNode head = null;
		ListNode res = null;
		while(h1 != null && h2 != null){
			ListNode cur = null;
			if(h1.val <= h2.val){
				cur = new ListNode(h1.val);
				h1 = h1.next;
			}else{
				cur = new ListNode(h2.val);
				h2 = h2.next;
			}
			if(head == null){
				head = cur;
				res = head;
			}else{
				head.next = cur;
				head = head.next;
			}
		}

		while(h1 == null && h2 != null){
			head = h2;
			h2 = h2.next;
			head = head.next;
		}

		while(h2 == null && h1 != null){
			head = h1;
			h1 = h1.next;
			head = head.next;
		}

		return res;
	}
}
