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
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while(cur!=null){
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.toString(),2);
    
        
    }
}