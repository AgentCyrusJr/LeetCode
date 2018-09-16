//link: https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/

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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) return list;
        LinkedList<Node> queue_1 = new LinkedList<Node>();
        LinkedList<Node> queue_2 = new LinkedList<Node>();
        List<Integer> temp_list = new ArrayList<Integer>();
        queue_1.add(root);
        list.add(new ArrayList<Integer>(Arrays.asList(root.val)));
        while(queue_1.size() != 0){
            Node node = queue_1.pop();
            if(node.children != null) queue_2.addAll(node.children);
            if(queue_1.size() == 0){
                queue_1 = queue_2;
                queue_2 = new LinkedList<Node>();
                for(Node n: queue_1){
                    temp_list.add(n.val);
                }
                if(temp_list.size() != 0) list.add(temp_list);
                temp_list = new ArrayList<Integer>();
            }
        }
        return list;
    }
}