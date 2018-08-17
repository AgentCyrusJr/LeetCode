//link: https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/

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
    public List<Integer> postorder(Node root) {
        if(root == null){
            return list;
        }else{
            for(Node child: root.children){
                postorder(child);
            }
            list.add(root.val);
        }
        return list;
    }
}

//Will update iterative solution soon