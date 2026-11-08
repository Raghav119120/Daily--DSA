// lc 82 t.c ->O(n) s.c ->O(1)
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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         ListNode dummy = new ListNode(-1,head);
//         ListNode temp = dummy;
//         while(temp.next!=null && temp.next.next!=null){
//             if(temp.next.val == temp.next.next.val){
//                 int duplicate = temp.next.val;
//                 while(temp.next!=null && temp.next.val == duplicate){
//                     temp.next = temp.next.next;
//                 }
//             }
//             else{
//                 temp = temp.next;
//             }
//         }
//         return dummy.next;
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.val == curr.next.val) {

                int duplicate = curr.val;

                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

                prev.next = curr;

            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
 
