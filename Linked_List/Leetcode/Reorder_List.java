
// https://leetcode.com/problems/reorder-list/description/
package Leetcode;

public class Reorder_List {
 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public void reorderList(ListNode head) {
        ListNode headfirst=head;
        ListNode mid= middle(head);
        ListNode headsecond= reverse(mid);
        if(head==null || head.next==null){
            return;
        }
        // rearrange 
        while(headfirst!=null && headsecond!=null){
            ListNode temp=headfirst.next;
            headfirst.next=headsecond;
            headfirst=temp;

            temp= headsecond.next;
            headsecond.next=headfirst;
            headsecond=temp;
        }
        if(headfirst!=null){
            headfirst.next=null;
        }

    }
    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode current=head;
        ListNode next= current.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}
