//link: https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }else{
            int max = 0;
            for(Node child: root.children){
                int depth = maxDepth(child);
                if(max<depth){
                    max = depth;
                }   
            } 
            return max+1;
        }
    }
}