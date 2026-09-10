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
        ListNode curr=head;
        ListNode prev=null;
        if(head.next==null){
            return null;
        }
        while(curr!=null){
            ListNode nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        head=prev;
        ListNode temp=head;
        for(int i=0;i<n-2;i++){
            temp=temp.next;
        }
        if(n==1){
            head=head.next;
        }
        else{
             temp.next=temp.next.next;
        }
        ListNode curr1=head;
        ListNode prev1=null;
        while(curr1!=null){
            ListNode nn1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=nn1;
        }
        head=prev1;
        return head;
    }
}