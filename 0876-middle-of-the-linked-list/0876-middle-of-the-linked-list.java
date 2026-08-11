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
        ListNode pre=null,curr=head;
        int count=0;
        while(curr!=null){
       
        count++;
       
        curr=curr.next;
    }
    ListNode temp=head;
    int mid=(count/2)+1;
    while(temp!=null){
        mid=mid-1;
        if(mid==0){
            break;
        }else{
        temp=temp.next;
        
    }}
    return temp;
    }
}