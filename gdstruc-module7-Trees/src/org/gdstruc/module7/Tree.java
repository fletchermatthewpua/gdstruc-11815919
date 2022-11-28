package org.gdstruc.module7;

public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return  null;
    }

    public void getMin(){
        if (root != null) {
            root.getMin();
        }
    }

    public void getMax(){
        if (root != null) {
            root.getMax();
        }
    }

    public void traverseInOrderDescending(){
        if (root != null) {
            root.traverseInOrderDescending();
        }
    }
}