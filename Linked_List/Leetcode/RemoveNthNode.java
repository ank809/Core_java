// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

package Leetcode;

public class RemoveNthNode {

 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            return head.next;
        }
        ListNode current= head;
        while(count-1>n){
            current=current.next;
            count--;
        }

       current.next= current.next.next; 
        return head;
    }
}
    
}
