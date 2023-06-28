package Leetcode;
// https://leetcode.com/problems/middle-of-the-linked-list/submissions/980627738/
public class middleOfLL {
     public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    
}
