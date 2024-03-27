package Leetcode;

public class startNode {
    // https://leetcode.com/problems/linked-list-cycle-ii/
    // 142 question
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthcycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // Now we will find the Node;
        ListNode f = head;
        while (f != slow) {
            f = f.next;
            slow = slow.next;
        }

        return f;
    }

    public int lengthcycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
                int len = 0;
                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);
                return len;
            }
        }

        return 0;
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
