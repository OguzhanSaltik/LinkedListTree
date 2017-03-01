package com.linkedListTree;

/* Class Tree */

class Tree {

    private TreeNode root;

    /**
     * Reference to the head node. Head's next element will be the root's node
     */
    private LinkedListNode head;

    /**
     * Tree constructor.
     */
    Tree() {
        root = null;
        head = new LinkedListNode();
    }

    /**
     * Getter method for the root node.
     *
     * @return root Root node.
     */
    TreeNode getRoot() {
        return root;
    }


    /**
     * Function to get height of node
     *
     * @param t {@link TreeNode}.
     * @return height Height of the node.
     */
    private int height(TreeNode t) {
        return t == null ? -1 : t.getHeight();
    }

    /**
     * Function to max of left/right node
     *
     * @param lhs Left hand side.
     * @param rhs Right hand side.
     * @return max maximum of the left/right node.
     */
    private int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    /**
     * Function to insert data
     *
     * @param data Data to be inserted.
     */
    void insert(int data) {
        root = insert(data, root);
    }

    /**
     * Function to insert data recursively.
     *
     * @param x Data.
     * @param t {@link TreeNode}.
     * @return t {@link TreeNode}.
     */
    private TreeNode insert(int x, TreeNode t) {
        if (t == null) {
            t = new TreeNode(x);
            insertListAdd(x, t);
        } else if (x < t.getData()) {
            t.setLeft(insert(x, t.getLeft()));
            if (height(t.getLeft()) - height(t.getRight()) == 2)
                if (x < t.getLeft().getData())
                    t = rotateWithLeftChild(t);
                else
                    t = doubleWithLeftChild(t);
        } else if (x > t.getData()) {
            t.setRight(insert(x, t.getRight()));
            if (height(t.getRight()) - height(t.getLeft()) == 2)
                if (x > t.getRight().getData())
                    t = rotateWithRightChild(t);
                else
                    t = doubleWithRightChild(t);
        } // If node is equal to new data, duplicate; do nothing.

        t.setHeight(max(height(t.getLeft()), height(t.getRight())) + 1);
        return t;
    }

    /**
     * This function finds the given data's Node
     *
     * @param r    Root {@link TreeNode}.
     * @param data Data.
     * @return LinkedListNode
     */
    private LinkedListNode findNode(TreeNode r, int data) {
        if (r != null) {
            findNode(r.getLeft(), data);
            if (r.getData() == data) {
                return r.getNode();
            }
            findNode(r.getRight(), data);
        }
        return null;
    }

    /**
     * This function appends the specified element to the end of this list.
     *
     * @param data Data.
     * @param t    {@link TreeNode}
     */
    private void insertListAdd(int data, TreeNode t) {
        t.setNode(new LinkedListNode());

        LinkedListNode current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        // the last node's "next" reference set to our new node
        current.setNext(t.getNode());
    }

    /**
     * Rotate binary tree node with left child
     *
     * @param treeNode {@link TreeNode}.
     * @return rotated {@link TreeNode}.
     */
    /*  */
    private TreeNode rotateWithLeftChild(TreeNode treeNode) {
        TreeNode leftTreeNode = treeNode.getLeft();
        treeNode.setLeft(leftTreeNode.getRight());
        leftTreeNode.setRight(treeNode);
        treeNode.setHeight(max(height(treeNode.getLeft()), height(treeNode.getRight())) + 1);
        leftTreeNode.setHeight(max(height(leftTreeNode.getLeft()), treeNode.getHeight()) + 1);

        return leftTreeNode;
    }

    /**
     * Rotate binary tree node with right child
     *
     * @param treeNode {@link TreeNode}.
     * @return rotated {@link TreeNode}.
     */
    /*  */
    private TreeNode rotateWithRightChild(TreeNode treeNode) {
        TreeNode rightTreeNode = treeNode.getRight();
        treeNode.setRight(rightTreeNode.getLeft());
        rightTreeNode.setLeft(treeNode);
        treeNode.setHeight(max(height(treeNode.getLeft()), height(treeNode.getRight())) + 1);
        rightTreeNode.setHeight(max(height(rightTreeNode.getRight()), treeNode.getHeight()) + 1);

        return rightTreeNode;
    }

    /**
     * Double rotate binary tree node: first left child with its right child, then node k3 with new left child
     *
     * @param treeNode {@link TreeNode}.
     * @return double rotated {@link TreeNode}.
     */
    private TreeNode doubleWithLeftChild(TreeNode treeNode) {
        treeNode.setLeft(rotateWithRightChild(treeNode.getLeft()));
        return rotateWithLeftChild(treeNode);
    }

    /**
     * Double rotate binary tree node: first right child with its left child, then node k1 with new right child.
     *
     * @param treeNode {@link TreeNode}.
     * @return double rotated {@link TreeNode}.
     */
    private TreeNode doubleWithRightChild(TreeNode treeNode) {
        treeNode.setRight(rotateWithLeftChild(treeNode.getRight()));
        return rotateWithRightChild(treeNode);
    }

    /**
     * Prints all tree data.
     */
    void insertOrder() {
        System.out.print(insertListToString());
    }

    /**
     * This function gets String representation of the all Tree data with head linkedlist referance.
     */
    private String insertListToString() {
        LinkedListNode current = head.getNext();
        String output = "[" + findData(getRoot(), current) + "]";
        data = "";
        while (current.getNext() != null) {
            output += "[" + findData(getRoot(), current.getNext()) + "]";
            current = current.getNext();
            data = "";
        }
        return output;
    }

    /**
     * Helper data string.
     */
    private String data = "";

    /**
     * This function finds the given list's data and returns data which type of
     * String
     */
    private String findData(TreeNode r, LinkedListNode list) {
        if (r != null) {
            findData(r.getLeft(), list);
            if (r.getNode() == list) {
                data += r.getData();
                return data;
            }
            findData(r.getRight(), list);
        }
        return data;
    }

    /**
     * Sorted tree with given root of the {@link TreeNode}.
     */
    void sortedOrder() {
        inorder(root);
    }

    /**
     * Function for inOrder traversal.
     *
     * @param treeNode {@link TreeNode}
     */
    private void inorder(TreeNode treeNode) {
        if (treeNode != null) {
            inorder(treeNode.getLeft());
            System.out.print(treeNode.getData() + "  ");
            inorder(treeNode.getRight());
        }
    }
}