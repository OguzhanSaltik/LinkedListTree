package com.linkedListTree;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InsertOrderTest {

    private Tree myTree;

    /* Initialization */
    @Before
    public void setUp() throws Exception {
        myTree = new Tree();

        myTree.insert(5);
        myTree.insert(1);
        myTree.insert(7);
        myTree.insert(6);
        myTree.insert(2);
    }

    @Test
    public final void insertOrderTest() {

        // Prepare to capture output
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        // Perform test
        myTree.insertOrder();
        String expected = "[5][1][7][6][2]";
        assertEquals(expected, os.toString());

        // Restore normal operation
        System.setOut(originalOut);
    }
}