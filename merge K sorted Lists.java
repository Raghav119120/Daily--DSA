//lc 23 t.c ->O(k*logk)+(n*k*logk) s.c ->O(k)
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode list : lists){
            if(list!=null){
                pq.add(list);
            }
        } 
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            temp.next = curr;
            temp = temp.next;
            if(curr.next!=null){
                pq.add(curr.next);
            }

        }
        return dummyNode.next;
    }
}
