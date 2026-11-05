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
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size+=1;
            temp=temp.next;
        }
        temp=head;
        int index=size-n;
        if(index==0) return head.next;
        while(temp!=null){
            if(index==1){
                temp.next=temp.next.next;
                break;
            }
        index--;
        temp=temp.next;
        }
    return head;
    }
}
