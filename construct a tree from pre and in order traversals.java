//lc 105
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int m = inorder.length;
        return dfs(preorder,inorder,0,n-1,0,m-1);
    }
    private TreeNode dfs(int[] preorder,int[] inorder,int preStart,int preEnd,int inStart,int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = -1;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i] == rootVal){
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex-inStart;
        root.left = dfs(preorder,inorder,preStart+1,preStart+leftSize,inStart,rootIndex-1);
        root.right = dfs(preorder,inorder,preStart+leftSize+1,preEnd,rootIndex+1,inEnd);
        return root;
    }
}
