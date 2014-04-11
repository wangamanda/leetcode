package LinkedList;

public class RemoveDuplicate{
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		head.next = second;
		ListNode third = new ListNode(2);
		second.next = third;
		ListNode res = deleteDuplicates(head);
		while(res != null){
			System.out.print(res.val+" ");
			res = res.next;
		}
		System.out.println();
	}

	public static ListNode deleteDuplicates(ListNode head){
		if(head == null || head.next == null){
			return head;
		}

		boolean remove_head = false;
		if(head.val == head.next.val){
			remove_head = true;
		}

		ListNode cur = head;
		ListNode former = cur.next;
		boolean repeat = false;
		while(former != null){
			if(cur.next.val == former.val){
				if(cur.next != former){
					repeat = true;
				}
				former = former.next;
			}else{
				if(repeat){
					cur.next = former;
					repeat = false;
				}else{
					cur = cur.next;
					former = cur.next;
				}
			}
		}

		if(repeat){
			cur.next = former;
		}

		if(remove_head){
			while(head.next != null && head.next.val == head.val){
				head.next = head.next.next;
			}
			head = head.next;
		}

		return head;
	}
}
