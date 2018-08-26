//link: https://leetcode.com/problems/leaf-similar-trees/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1 = find_tree_node(root1, list1);
        list2 = find_tree_node(root2, list2);
        return list1.equals(list2);
    }
    
    public List find_tree_node(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        if(root.left == null & root.right == null){
            list.add(root.val);
        }else{
            list = find_tree_node(root.left, list);
            list = find_tree_node(root.right, list);
        }
        return list;
    }
}