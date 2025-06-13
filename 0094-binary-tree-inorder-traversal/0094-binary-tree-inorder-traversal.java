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
    public static void help(ArrayList<Integer> arr,TreeNode root ){
    if(root==null) return ;
    help(arr,root.left);
    arr.add(root.val);
    help(arr,root.right);
}


    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        help(arr,root);
        return arr;
    }
  
}