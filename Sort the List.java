// lc 148 t.c ->O(log n*(n+n/2)) s.c ->O(log n)//recursive stack space
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode lefthead = head;
        ListNode righthead = middle.next;
        middle.next = null;
        lefthead = sortList(lefthead);
        righthead = sortList(righthead);
        return merge2(lefthead,righthead);
    }
    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge2(ListNode list1, ListNode list2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return dummyNode.next;
    }
}
