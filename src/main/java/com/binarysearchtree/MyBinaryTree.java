package com.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareOutput = key.compareTo(current.key);
        if (compareOutput == 0)
            return current;

        if (compareOutput < 0)
            current.left = addRecursively(current.left, key);
        else if (compareOutput > 0)
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int size() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(MyBinaryNode<K> current) {
        return (current == null) ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
    }

}