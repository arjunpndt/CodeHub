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
    public boolean isPalindrome(ListNode head) {
        long temp=0,rev=0,k=1;
        while(head!=null){
            temp=temp*10+head.val;
            rev=head.val*k+rev;
            head=head.next;
            k=k*10;
        }
       
       if(temp==rev)
           return true;
        return false;
    }
}