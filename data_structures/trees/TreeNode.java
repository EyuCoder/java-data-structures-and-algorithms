package data_structures.trees;

public class TreeNode {
    private double data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(double data) {
        this.data = data;
    }

    public TreeNode get(double value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) return leftChild.get(value);
        } else {
            if (rightChild != null) return rightChild.get(value);
        }
        return null;
    }

    public void insert(double value) {
        if (value == data) return; //no duplicates

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traversePreOrder() {
        System.out.print(data + ", ");
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }

        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");

        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePostOrder();
        }

        if (rightChild != null) {
            rightChild.traversePostOrder();
        }
        System.out.print(data + ", ");
    }

    public double min() {
        if (leftChild != null) {
            return leftChild.min();
        } else return data;
    }

    public double max() {
        if (rightChild != null) {
            return rightChild.max();
        } else return data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
