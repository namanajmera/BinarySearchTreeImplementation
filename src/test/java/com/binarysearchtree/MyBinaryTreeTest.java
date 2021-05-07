package com.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        Assertions.assertEquals(3, myBinaryTree.size());
    }
}
