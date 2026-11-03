/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        //t.c ->O(n) s.c ->O(2n)
        // Stack<TreeNode> st1 = new Stack<>();
        // Stack<TreeNode> st2 = new Stack<>();
        // List<Integer> postorder = new ArrayList<>();
        // if(root == null) return postorder;
        // st1.push(root);
        // while(!st1.isEmpty()){
        //     root = st1.pop();
        //     st2.add(root);
        //     if(root.left!=null) st1.push(root.left);
        //     if(root.right!=null) st1.push(root.right);
            
        // }
        // while(!st2.isEmpty()){
        //     postorder.add(st2.pop().val);
        // }
        // return postorder;

        //t.c ->O(2n) s.c ->O(n)
        List<Integer> post = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode visited = null;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode peek = st.peek();
                if (peek.right != null && visited != peek.right) {
                    curr = peek.right;
                }
                else {
                    
                    post.add(peek.val);
                    visited = st.pop();
                }
            }
        }
        return post;
    }
}
