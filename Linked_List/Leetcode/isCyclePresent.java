package Leetcode;
// 141 Question on Leetcode
// Amazon and Microsoft
// https:leetcode.com/problems/linked-list-cycle/
public class isCyclePresent {
    public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
        }
        return false;
        
    }
    // find length of the list
    public int lengthcycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                ListNode temp=slow;
                int len=0;
                   do{
                    temp=temp.next;
                    len++;
                   }while(temp!=slow);
                   return len;
                }
                
        }
        return 0;
    }
}
}


class ListNode {
      int val;
    ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
