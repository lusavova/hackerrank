//https://www.hackerrank.com/challenges/tree-postorder-traversal/problem

package trees.traverse;

class PostorderTraversal {
    public void postOrder(Node root) {
        if (root.left != null)
            postOrder(root.left);
        if (root.right != null)
            postOrder(root.right);

        System.out.print(root.data + " ");
    }
}
