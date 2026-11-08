// lc 206 t.c ->O(n) s.c ->O(1)
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
// 
class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode prev = null;
        // ListNode curr = head;
        // while(curr != null){
        //     ListNode next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next; 
        // }
        // return prev;
        // ListNode prev = null;
        // ListNode temp = head;
        // while(temp!=null){
        //     ListNode front = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = front;
        // }
        // return prev;

        // recursive solution t.c ->O(n) s.c ->O(n) recursive stack space
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
