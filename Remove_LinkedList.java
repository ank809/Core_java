public class Remove_LinkedList {
    
    
  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
    ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
    public ListNode removeElements(ListNode head, int val) {
        ListNode node= head;
        if(head==null){
            return head;
        }
        while(node.next!=null){
            if(node.next.val==val){
               node.next=node.next.next;
            }
            else{
            node=node.next;
            }
        }
     if(head.val==val){
         head=head.next;
     }
     return head;
    }
}
