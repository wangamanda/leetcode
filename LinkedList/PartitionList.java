package LinkedList;

public class PartitionList{
	public static ListNode n1 = new ListNode(1);
	public static ListNode n2 = new ListNode(4);
	public static ListNode n3 = new ListNode(3);
	public static ListNode n4 = new ListNode(2);
	public static ListNode n5 = new ListNode(5);
	public static ListNode n6 = new ListNode(2);
	
	public static void main(String[] args){
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		ListNode cur = n1;
		while(cur != null){
			System.out.print(cur.val);
			cur = cur.next;
		}
		System.out.println();

		Partition(n1, 3);
		cur = n1;
		while(cur != null){
			System.out.print(cur.val);
			cur = cur.next;
		}
		System.out.println();
	}

	public static void Partition(ListNode head, int k){
		if(head == null || head.next == null){
			return;
		}	

		ListNode cur = head;
		ListNode former = head.next;
		while(former != null){
			if(former.val < k && cur.val >= k){
				int t = former.val;
				former.val = cur.val;
				cur.val = t;
			}
			if(former.val >= k){
				former = former.next;
			}
			if(cur.val < k){
				cur = cur.next;
			}
			if(former == null || cur == null){
				break;
			}
			if(former == cur){
				former = cur.next;
			}
		}
	}
}
