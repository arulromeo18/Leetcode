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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        int carry=0;
        ListNode result=null;
        ListNode head=null;
        while(list1!=null||list2!=null||carry!=0){

            int digit1=list1!=null?list1.val:0;
            int digit2=list2!=null?list2.val:0;

            int sum=digit1+digit2+carry;

            if(head==null){
                result=new ListNode(sum%10);
                head=result;
            }
            else{
                result.next=new ListNode(sum%10);
                result=result.next;
            }
            carry=sum/10;
            if(list1!=null) list1=list1.next;
            
            if(list2!=null) list2=list2.next;

        }
        return head;
    }
}