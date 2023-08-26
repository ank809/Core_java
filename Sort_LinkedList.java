// https://leetcode.com/problems/sort-list/

public class Sort_LinkedList {
    
 //  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode sortList(ListNode head) {
        // if the list is empty or have only one element
        if(head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        ListNode mid = getMid(head);
        ListNode second = sortList(mid);
        ListNode first = sortList(head);
        return mergeList(first, second);
    }
    ListNode getMid(ListNode head){
        ListNode midPrev= null;
        while(head!=null && head.next!=null){
            midPrev= midPrev==null ? head: midPrev.next;
            head=head.next.next;
        }
        ListNode mid= midPrev.next;
        midPrev.next= null;
        return mid;
    }

    public static ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = list1 != null ? list1 : list2;
        return dummyHead.next;
    }
}
