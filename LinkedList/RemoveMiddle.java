package LinkedList;

import java.util.Arrays;

public class RemoveMiddle{
	static ListNode head = new ListNode(1);
	static ListNode second = new ListNode(2);
	static ListNode third = new ListNode(3);
	static ListNode forth = new ListNode(4);
	static ListNode fifth = new ListNode(5);

	public static void main(String[] args){
		head.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		Delete(third);
		System.out.println(second.next.val+"");
	}

	public static boolean Delete(ListNode node){
		if(node == null){
			return false;
		}

		if(node.next == null){
			return false;
		}

		node.val = node.next.val;
		node.next = node.next.next;
		return true;
	}
}
