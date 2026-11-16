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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null) return true;
        if(root==null) return false;
        if (checkSubRoot(root, subRoot)) {
            return true;
        }
       return isSubtree(root.right,subRoot) ||  isSubtree(root.left,subRoot);
    }
    private boolean checkSubRoot(TreeNode root,TreeNode subRoot){      if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

       
       return root.val==subRoot.val ? checkSubRoot(root.left,subRoot.left) && checkSubRoot(root.right,subRoot.right) :false;
    }
}
