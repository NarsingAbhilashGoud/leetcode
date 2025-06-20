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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;

        return checkSymmetric(root.left,root.right);
    }


    public static boolean checkSymmetric(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if((p==null || q==null) ||  (p.val!=q.val)) return false;
       
        return checkSymmetric(p.left,q.right) && checkSymmetric(p.right,q.left);
    }
}