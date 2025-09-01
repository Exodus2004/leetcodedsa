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
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        if(count==n) return head.next;
        ListNode start = head;
        int v = 0;
        for(int i=0;i<count-n-1;i++) start = start.next;
    

        start.next = start.next.next;

        

        return head;

        
    }
}