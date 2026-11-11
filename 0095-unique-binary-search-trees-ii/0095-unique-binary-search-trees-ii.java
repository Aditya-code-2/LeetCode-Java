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
    public List<TreeNode> generateTrees(int n) {
        return solve(1, n);

    }
    public List<TreeNode> solve(int start, int end){
        List<TreeNode> ans = new ArrayList<>();

        // No nodes available
        if (start > end) {
            ans.add(null);
            return ans;
        }

        for(int i = start; i <= end; i++){

            //find left, right nodes
            List<TreeNode> leftTree = solve(start, i-1);
            List<TreeNode> rightTree = solve(i+1, end);

            //combine
            for(TreeNode left : leftTree){
                for(TreeNode right : rightTree){
                    //make a root
                    TreeNode root = new TreeNode(i);

                    root.left = left;
                    root.right = right;
                    ans.add(root);
                }
            }
            
        }
        return ans;
    }
} 