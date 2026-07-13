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
    public static void InOrderTraversal(TreeNode root,List<Integer> ans){
        if(root==null){
                return; 
            }
            InOrderTraversal(root.left,ans);
            ans.add(root.val);
            InOrderTraversal(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        InOrderTraversal(root,ans);
        return ans;
    }
}