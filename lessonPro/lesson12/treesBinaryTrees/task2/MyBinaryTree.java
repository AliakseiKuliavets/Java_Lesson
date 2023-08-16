package org.telran.lessonPro.lesson12.treesBinaryTrees.task2;

public class MyBinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }


    public Node search(int key) {
        Node current = root;  //var current = root
        while (current.getKey() != key) {
            if (current.getKey() > key) {
                current = current.getLeft();
            } else  {
                current = current.getRight();
            }
            if (current == null) {
                return current;
            }
        }
        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int key, String value) {
        if (isEmpty()) {
            root = new Node(key, value);
        } else {
            Node current = root;
            Node parent = null;

            while (current != null) {
                if (key == current.getKey()) {
                    current.setValue(value);
                    return;
                } else if (key < current.getKey()) {
                    parent = current;
                    current = current.getLeft();
                } else {
                    parent = current;
                    current = current.getRight();
                }
            }

            if (key < parent.getKey()) {
                parent.setLeft(new Node(key,value));
            } else {
                parent.setRight(new Node(key,value));
            }
        }
    }
}
