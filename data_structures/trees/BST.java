package data_structures.trees;

/**
 * insertion: (log n) Logarithmic
 * deletion: (log n) Logarithmic
 * retrieval: (log n) Logarithmic
 */
public class BST {

    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(24.4);
        myTree.insert(20.2);
        myTree.insert(11.3);
        myTree.insert(11.33);
        myTree.insert(0.3324);
        myTree.insert(43.545);
        myTree.insert(0.001);
        myTree.insert(223.3);
        myTree.insert(222);
        myTree.insert(17.99);

        myTree.traversePreOrder();
        System.out.println();
        myTree.traverseInOrder();
        System.out.println();
        myTree.traversePostOrder();
        System.out.println();

        System.out.println(myTree.get(43.545));
        System.out.println(myTree.get(9999.999));

        System.out.println(myTree.min());
        System.out.println(myTree.max());

        myTree.delete(0.001);
        myTree.traverseInOrder();
        myTree.delete(3453453.3);
        System.out.println();
        myTree.traverseInOrder();
    }
}
