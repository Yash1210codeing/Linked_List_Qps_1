package Linked_List_Qps_1;
public class Merge_Two_Sorted_List_Leetcode_21 {
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
class solution{
	public ListNode mergeTwoLists(ListNode List1,ListNode List2) {
		ListNode dummy=new ListNode();
		ListNode temp=dummy;
		while(List1!=null&&List2!=null) {
			if(List1.val<List2.val) {
				dummy.next=List1;
				dummy=dummy.next;
				List1=List1.next;
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
}
 }