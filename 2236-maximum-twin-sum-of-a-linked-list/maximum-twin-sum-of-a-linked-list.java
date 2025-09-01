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
    public int pairSum(ListNode head) {
    if(head==null) return 0;
    ListNode dup = new ListNode(0);
    ListNode cur = dup;
    ListNode temp = head;

    while(temp!=null){
        cur.next = new ListNode(temp.val);
        cur = cur.next;
        temp =temp.next;

    }
    ListNode start = dup.next;
    ListNode rev = fun(head);
    int max = 0;
    
    while(start!=null){
        
        
        
        int sum = start.val+rev.val;
        max = Math.max(max,sum);
        
        rev = rev.next;
        start = start.next;

    }
    return max;
    
        
    }
    ListNode fun(ListNode head){
        ListNode cur = head;
        ListNode prev  =null;

        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        return prev;
    }

}