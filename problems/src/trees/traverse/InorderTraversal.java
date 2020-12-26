//https://www.hackerrank.com/challenges/tree-inorder-traversal/problem

package trees.traverse;

class InorderTraversal {
    public void inOrder(Node root) {
        if (root.left != null)
            inOrder(root.left);
        System.out.print(root.data + " ");
        if (root.right != null)
            inOrder(root.right);
    }
}
