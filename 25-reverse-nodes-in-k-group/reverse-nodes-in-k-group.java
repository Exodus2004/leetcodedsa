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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==0) return head;
        int len = 0;
        ListNode cur = head;

        while(cur!=null){
            cur= cur.next;
            len++;
        }
        ListNode dummy = new ListNode(0);

        dummy.next = head;
        ListNode tail = dummy;
        ListNode present = head;

        while(len>=k){
            ListNode first = present;
            ListNode next = null;
            ListNode prev = null;
            for(int i=1;i<=k;i++){
                next = present.next;
                present.next = prev;
                prev = present;
                present = next;
            }
            // prev.next = null;
            tail.next = prev;
            tail = first;


            len = len-k;

        }
        tail.next = present;
        return dummy.next;
        
        
    }
}