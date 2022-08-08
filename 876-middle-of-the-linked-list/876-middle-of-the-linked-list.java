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
    public ListNode middleNode(ListNode head) {
        ListNode node=head;
        int count=0,i=0;
        while(node!=null){
            node=node.next;
            count++;
        }
        while(i<count/2){
            head=head.next;
            i++;
        }
        return head;
    }
}