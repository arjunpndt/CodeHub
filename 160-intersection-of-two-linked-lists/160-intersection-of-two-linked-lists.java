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
        ListNode a=headA,b=headB;
        ListNode res =null;
        // if(a.next==null && b.next==null){
        //     
        //     else{
        //          return null;
        //     } 
        // }   
        if(a==b){
                return a;
            }
        
        HashSet<ListNode> set = new HashSet();
        while(a!=null){
            set.add(a);
           
            a=a.next;
        }
        while(b!=null){
            if(set.add(b)){
                 b=b.next;
            }
            else{
                res = b;
               return res;
            }
           
        }
        return res;
}
}