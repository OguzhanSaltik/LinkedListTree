package com.linkedListTree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertDataTest {

    private Tree myTree;

    /* Initialization */
    @Before
    public void setUp() throws Exception {
        myTree = new Tree();
    }

    @Test
    public void insertDataTest() {

        myTree.insert(5);

        TreeNode testNode = myTree.getRoot();
        assertEquals(testNode.getData(), 5);
    }
}