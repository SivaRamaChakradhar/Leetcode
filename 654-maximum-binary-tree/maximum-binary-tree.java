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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        }

        int maxIndex = findMaxIndex(nums);

        int[] left = Arrays.copyOfRange(nums, 0, maxIndex);
        int[] right = Arrays.copyOfRange(nums, maxIndex+1, nums.length);

        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = constructMaximumBinaryTree(left);
        root.right = constructMaximumBinaryTree(right);
        
        return root;
    }   
    public int findMaxIndex(int[] nums){
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}