
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        if(head==null) return false;
        while(fast!=null && fast.next!=null){
            head = head.next;
            fast=fast.next.next;
            if(fast==head) return true;
        }
        return false;
    }
}