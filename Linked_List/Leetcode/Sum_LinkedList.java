// https://leetcode.com/problems/add-two-numbers/

package Leetcode;

public class Sum_LinkedList {
    
 //  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum= new ListNode();
        int carry=0;
        ListNode head=sum;
        while(l1!=null && l2!=null){
            int value= l1.val+l2.val+carry;
            carry=value/10;
            sum.next= new ListNode(value%10);
            sum=sum.next;
            l1=l1.next;
            l2=l2.next;

        }
        while(l1!=null){
            int value= l1.val+carry;
            carry= value/10;
            sum.next= new ListNode(value%10);
            sum=sum.next;
            l1=l1.next;
        }
        while(l2!=null){
            int value= l2.val+carry;
            carry= value/10;
            sum.next= new ListNode(value%10);
            sum=sum.next;
            l2=l2.next;
        }
        if(carry!=0){
            sum.next= new ListNode(carry%10);
            sum=sum.next;
        }
        return head.next;

    }
}
