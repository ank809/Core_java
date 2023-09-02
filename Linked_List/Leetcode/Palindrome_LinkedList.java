//https://leetcode.com/problems/palindrome-linked-list/description/

package Leetcode;

public class Palindrome_LinkedList {
    
 //  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode middleNode(ListNode head){
        ListNode fast=head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev= null;
        ListNode  current=head;
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
    public boolean isPalindrome(ListNode head) {
        ListNode first= head;
      ListNode mid= middleNode(head);
      ListNode second= reverse(mid);
      if(head==null || head.next==null){
          return true;
      }
      while(second!=null){
          if(first.val!=second.val){
              return false;
          }
          first=first.next;
          second=second.next;
      }
      return true;
}
}
}
