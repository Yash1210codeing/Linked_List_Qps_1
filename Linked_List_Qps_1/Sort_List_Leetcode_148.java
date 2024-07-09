package Linked_List_Qps_1;
import Linked_List_Qps_1.Merge_Two_Sorted_List_Leetcode_21.ListNode;
public class Sort_List_Leetcode_148 {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(){		
		}
		ListNode(int val){
			this.val=val;
		}
		ListNode(int val,ListNode next){
			this.val=val;
			this.next=next;
		}
    }
	class Solution{
		public ListNode sortList(ListNode head) {
			if(head==null||head.next==null) {
				return head;
			}
			ListNode mid= mid(head);
			ListNode headb=mid.next;
			mid.next=null;
			ListNode L1=sortList(head);
			ListNode L2=sortList(headb);
			return mergeTwoLists(L1,L2);
		}
		public ListNode mergeTwoLists(ListNode List1,ListNode List2) {
			ListNode dummy=new ListNode();
			ListNode temp=dummy;
			while(List1!=null&&List2!=null) {
				if(List1.val<List2.val) {
					dummy.next=List1;
					dummy=dummy.next;
					List1=List2.next;
				}else {
					dummy.next=List2;
					dummy=dummy.next;
					List2=List2.next;
				}
			}
			if(List1==null) {
				dummy.next=List2;
			}if(List2==null) {
				dummy.next=List1;
			}
			return temp.next;
		}
		public ListNode mid(ListNode head) {
			ListNode slow=head;
			ListNode fast=head;
			while(fast!=null&&fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			return slow;
		}
	}
}