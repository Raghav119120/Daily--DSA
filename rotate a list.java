//lc 61 t.c ->O(2n) s.c ->O(1)
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode tail = head;
        int len = 1;
        while(tail.next!=null){
            tail = tail.next;
            len++;
        }
        if(k%len == 0) return head;
        k = k%len;
        tail.next = head;
        ListNode newLastNode = findNth(head,len-k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
        
    }
    private ListNode findNth(ListNode temp, int k){
        int cnt = 1;
        while(temp!=null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
}
