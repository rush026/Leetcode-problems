/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, ListNode> res=new HashMap<>();
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            res.put(temp,temp.next);
            temp=temp.next.next;
            if(res.containsKey(temp)){
                return true;
                
            }
        }
        return false;
    }
}