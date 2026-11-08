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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         Stack<Integer> s1  = new Stack<>();
//         Stack<Integer> s2  = new Stack<>();
      
        
//         ListNode temp1 = l1;
//         while(temp1!=null){
//             s1.push(temp1.val);
//             temp1 = temp1.next;
//         }
//         ListNode temp2 = l2;
//         while(temp2!=null){
//             s2.push(temp2.val);
//             temp2 = temp2.next;
//         }
//         int carry = 0;
//         ListNode head = null;
//         while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
//             int sum = carry;
//             if(!s1.isEmpty()) sum += s1.pop();
//             if(!s2.isEmpty()) sum += s2.pop();
//             carry = sum/10;
//             ListNode newNode = new ListNode(sum%10);
//             newNode.next = head;
//             head = newNode;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

    public ListNode helper(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode ans = helper(l1, l2);
        return reverseList(ans);
    }
}
