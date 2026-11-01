// lc 25 t.c ->O(2n) s.c ->O(1)
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
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode kthNode = getkthNode(temp,k);
            if(kthNode == null){
                prev.next = temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head){
                head = kthNode;
            }
            else{
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
    private ListNode getkthNode(ListNode temp, int k){
        k -= 1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;

        }
        return temp;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
