package Leetcode;

public class IntersectionTwoLL {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1= getLength(headA);
        int len2= getLength(headB);

        while(len1>len2){
            len1--;
            headA=headA.next;
        }
        while(len1<len2){
            len2--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }

    private int getLength(ListNode head){
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}

    
}
