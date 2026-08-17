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
        ListNode curr=headA;
        HashMap<ListNode,ListNode> res=new HashMap<>();
        while(curr!=null){
            
            res.put(curr,curr.next);
            curr=curr.next;
                
            }
            ListNode temp=headB;
            while(temp!=null){
                if(res.containsKey(temp)) return temp;
                temp=temp.next;
            }
        
        return null;
    }
}