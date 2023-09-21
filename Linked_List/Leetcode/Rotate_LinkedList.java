// https://leetcode.com/problems/rotate-list/description/

package Leetcode;

public class Rotate_LinkedList {
 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head==null || head.next==null){
            return head;
        }
        //  find the tail and the length of the linked list
        ListNode tail= head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }

        // point the tail to the head;
        tail.next=head;
        // number of times you want to rotate the list 
        int rotations= k%length;

    // number of nodes you want to skip 
        int skip=  length-rotations;

        ListNode newtail=head;
        // find the new tail
        for(int i=0; i<skip-1; i++){
            newtail=newtail.next;
        }
        head= newtail.next;
        newtail.next=null;
        return head;
    }
    
}
