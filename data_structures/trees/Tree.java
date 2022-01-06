package data_structures.trees;

public class Tree {
    private TreeNode root;

    public TreeNode get(double value) {
        if (root != null) return root.get(value);
        return null;
    }

    public void insert(double value) {
        if (root != null) root.insert(value);
        else root = new TreeNode(value);
    }

    public void delete(double value) {
        root = delete(root, value);
    }

    public void traversePreOrder() {
        if (root != null) root.traversePreOrder();
    }

    public void traverseInOrder() {
        if (root != null) root.traverseInOrder();
    }

    public void traversePostOrder() {
        if (root != null) root.traversePostOrder();
    }

    private TreeNode delete(TreeNode subtree, double value) {
        if (subtree == null) return null;

        if (value < subtree.getData()) {
            subtree.setLeftChild(delete(subtree.getLeftChild(), value));
        } else if (value > subtree.getData()) {
            subtree.setRightChild(delete(subtree.getRightChild(), value));
        } else {
            if (subtree.getLeftChild() == null)
                return subtree.getRightChild();
            else if (subtree.getRightChild() == null)
                return subtree.getLeftChild();

            subtree.setData(subtree.getRightChild().min());
            subtree.setRightChild(delete(subtree.getRightChild(), subtree.getData()));
        }

        return subtree;
    }

    public double min() {
        if (root == null) return Double.MIN_VALUE;
        else return root.min();
    }

    public double max() {
        if (root == null) return Double.MAX_VALUE;
        else return root.max();
    }
}
