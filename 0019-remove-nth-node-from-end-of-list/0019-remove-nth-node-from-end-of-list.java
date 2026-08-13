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
        if(head==null) return null;
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
            
        }
        if(count==n){
            head=head.next;
        }
        int c=count-n;
        ListNode temp=head;
        while(temp!=null){
            c--;
            if(c==0){
                 ListNode res=temp.next;
                temp.next=temp.next.next;
               
                break;
            }else{
                temp=temp.next;
            }
            }
           
        
        return head;
    }
}