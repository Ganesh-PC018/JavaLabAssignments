class Node
{
    Node left;
    Node right;
    int data;
}
class Solution {
    public Node flattenBST(Node root) {
        // Code here
        Node newNode = new Node();
        Node r = helper(root,newNode);
        return r;
    }
    
    public static Node helper(Node root,Node newNode)
    {
        helper(root.left);
        newNode.right = root.data;
        helper(root.right);
        return  newNode;
    }
}