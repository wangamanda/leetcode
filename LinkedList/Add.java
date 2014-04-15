package LinkedList;

public class Add{
	public static void main(String[] args){
		ListNode n1 = new ListNode(7);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;

		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(9);
		ListNode n6 = new ListNode(2);
		n4.next = n5;
		n5.next = n6;

		ListNode cur1 = n1;
		ListNode cur2 = n4;
		int sum = 0;
		int carry = 0;
		while(cur1 != null || cur2 != null){
			if(cur1 == null){
				ListNode cur = new ListNode(carry + cur2.val);
				cur1.next = cur;
				cur1 = cur;
				carry = 0;
				cur2 = cur2.next;
			}else if(cur2 == null){
				cur1.val = cur1.val + carry;
				carry = 0;
				cur1 = cur1.next;
			}else{
				sum = (carry + cur1.val + cur2.val)%10;
				carry = (carry + cur1.val + cur2.val)/10;
				cur1.val = sum;
				cur1 = cur1.next;
				cur2 = cur2.next;
			}
		}

		while(n1 != null){
			System.out.print(n1.val + " ");
			n1 = n1.next;
		}
		System.out.println();
	}
}
