package LinkedList;

import java.util.Stack;

public class Palindrome{
	public static ListNode n1 = new ListNode(1);
	public static ListNode n2 = new ListNode(2);
	public static ListNode n3 = new ListNode(3);
	public static ListNode n6 = new ListNode(2);
	public static ListNode n4 = new ListNode(2);
	public static ListNode n5 = new ListNode(1);

	public static void main(String[] args){
		n1.next = n2;
		n2.next = n3;
		n3.next = n6;
		n6.next = n4;
		n4.next = n5;
		
		boolean res = isPalindrome(n1);
		if(res){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	public static boolean isPalindrome(ListNode n){
		ListNode fast = n;
		ListNode slow = n;
		Stack<Integer> stack = new Stack<Integer>();
		while(fast != null && fast.next != null){
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}

		if(fast != null){
			slow = slow.next;
		}

		while(slow != null){
			int t = stack.pop();
			if(slow.val != t){
				return false;
			}
			slow = slow.next;
		}

		return true;
	}
}

