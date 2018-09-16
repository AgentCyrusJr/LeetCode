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

//Iterative Solution
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        List<Node> temp_list = new ArrayList<Node>();
        temp_list.add(root);
        while(temp_list.size() != 0){
            Node node = temp_list.remove(temp_list.size()-1);
            list.add(node.val);
            if(node.children != null){
                temp_list.addAll(node.children);
            }
        }
        Collections.reverse(list);
        return list;
    }
}