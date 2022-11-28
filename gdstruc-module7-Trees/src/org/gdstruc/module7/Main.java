package org.gdstruc.module7;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        //traverse the tree (in-order)
        //tree.traverseInOrder();

        // search a node by value
        //System.out.println(tree.get(1000));

        //tree.getMin();
        //tree.getMax();

        tree.traverseInOrderDescending();
    }
}