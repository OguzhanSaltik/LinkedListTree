package com.linkedListTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalanceTest {

    private Tree myTree;

    /* Initialization */
    @Before
    public void setUp() throws Exception {
        myTree = new Tree();

    }

    @Test
    public void rotateLeftTest() {

        myTree.insert(5);
        myTree.insert(6);
        myTree.insert(7);

        TreeNode root = myTree.getRoot();

        assertEquals(root.getData(), 6);
        assertEquals(root.getLeft().getData(), 5);
        assertEquals(root.getRight().getData(), 7);
    }

    @Test
    public void rotateRightTest() {

        myTree.insert(5);
        myTree.insert(4);
        myTree.insert(3);

        TreeNode root = myTree.getRoot();

        assertEquals(root.getData(), 4);
        assertEquals(root.getLeft().getData(), 3);
        assertEquals(root.getRight().getData(), 5);
    }
}
