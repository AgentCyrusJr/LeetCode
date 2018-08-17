//link: https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/

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
//Recursive Solution
class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return list;
        }else{
            list.add(root.val);
            for(Node child: root.children){
                preorder(child);
            }
        }
        return list;
    }
}

//Will update iterative solution soon