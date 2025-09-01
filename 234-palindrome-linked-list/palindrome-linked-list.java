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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;

        ListNode cur = head;
        StringBuilder s = new StringBuilder();
        while(cur!=null){
            s.append(cur.val);
            cur = cur.next;


        }
        return s.toString().equals(s.reverse().toString());
        
    }
}