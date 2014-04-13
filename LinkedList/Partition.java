package LinkedList;

public class Partition{
	public static void main(String[] args){
		ListNode n1 = new ListNode(7);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(2);
		ListNode n7 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode cur = partitionX(n1,5);
		while(cur != null){
			System.out.print(cur.val);
			cur = cur.next;
		}
		System.out.println();
	}

	public static void partition(ListNode cur, int n){
		if(cur == null || cur.next == null){
			return;
		}

		ListNode slower = cur;
		ListNode former = slower.next;

		while(former.next != null){
			if(former.val >= n){
				former = former.next;
			}else{
				if(slower.val < n){
					slower = slower.next;
				}else{
					int tmp = former.val;
					former.val = slower.val;
					slower.val = tmp;
				}
			}
		}
	}

	public static ListNode partitionX(ListNode cur, int n){
		ListNode start_small = null;
		ListNode end_small = null;
		ListNode start_big = null;
		ListNode end_big = null;

		if(cur == null || cur.next == null){
			return cur;
		}

		while(cur != null){
			ListNode node = new ListNode(cur.val);
			if(cur.val < n){
				if(start_small == null){
					start_small = node;
					end_small = node;
				}else{
					end_small.next = node;
					end_small = node;
				}
			}else{
				if(start_big == null){
					start_big = node;
					end_big = node;
				}else{
					end_big.next = node;
					end_big = node;
				}
			}
			cur = cur.next;
		}

		end_small.next = start_big;
		return start_small;
	}
}
