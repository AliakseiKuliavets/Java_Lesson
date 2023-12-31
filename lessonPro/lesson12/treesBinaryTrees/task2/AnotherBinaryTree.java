package org.telran.lessonPro.lesson12.treesBinaryTrees.task2;

import lombok.Getter;

import java.util.Objects;

public class AnotherBinaryTree {
    private Node root;
    public boolean isEmpty() {
        return root == null;
    }
    public Node getRoot() {
        return root;
    }
    public  void delete(int key) {

    }
    private Node deleteRecursive(Node current, int key) {
        if (current == null) {
            return null;
        }
        if (key < current.key) {
            current.left = deleteRecursive(current.left, key);
        } else if (key > current.key) {
            current.right = deleteRecursive(current.right, key);
        }
        if (key == current.key){
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }
//            Node smallNode = findSmallestKey(current.right);
//            current.key = smallNode.getKey();
//            current.value = smallNode.value;
//            current.right = deleteRecursive(current.right, smallNode.getKey());
        }
            return current;
    }

    private int findSmallestKey(Node node) {
        return node.left == null ? root.key : findSmallestKey(node.getLeft());
    }
    public void add(int key, String value) {
        root = addRecursive(root,key, value);
    }

    private Node addRecursive(Node current, int key, String value) {
        if (current == null) {
           return new Node(key, value);
        }
        if (key < current.key) {
            current.left = addRecursive(current.left, key, value);
        } else {
            current.right = addRecursive(current.right,  key, value);
        }
        return current;
    }
    public static class  Node {

        @Getter
        private int key;
        @Getter
        private String value;
        @Getter
        private Node right;
        @Getter
        private Node left;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return "AnotherBinaryTree{" +
                "root=" + root +
                '}';
    }
}
