/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0,i=0;
        ListNode node=head;
        count = linklen(head);
        if(head==null || head.next==null)
            return null;
        if(n==count){
            head=head.next;
        }
        while(i<count-n-1){
            node=node.next;
            i++;
        }
        if(node.next!=null){
            node.next=node.next.next;
        }
        return head;
    }
    public int linklen(ListNode head){
        ListNode tem = head;
        int x=0;
        while(tem!=null){
            x++;
            tem=tem.next;
        }
        return x;
    }
}