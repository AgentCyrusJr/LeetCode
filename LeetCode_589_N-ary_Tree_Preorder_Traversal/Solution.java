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

//iterative Solution
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        List<Node> temp_list = new ArrayList<Node>();
        temp_list.add(root);
        while(temp_list.size() != 0){
            Node node = temp_list.remove(0);
            list.add(node.val);
            if(node.children != null){
                temp_list.addAll(0, node.children);
            }
        }
        return list;
    }
}