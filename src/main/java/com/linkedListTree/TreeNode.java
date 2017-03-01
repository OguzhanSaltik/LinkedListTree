package com.linkedListTree;

class TreeNode {

    private TreeNode left, right;

    private LinkedListNode node;

    private int data;

    private int height;

    /**
     * Constructor
     */
    public TreeNode() {
        left = null;
        right = null;
        node = null;
        data = 0;
        height = 0;
    }

    /**
     * Constructor with parameter data.
     *
     * @param n Data.
     */
    TreeNode(int n) {
        left = null;
        right = null;
        node = null;
        data = n;
        height = 0;
    }

    /**
     * Getter method for the {@link #data}.
     *
     * @return data Data of the {@link TreeNode}.
     */
    int getData() {
        return data;
    }

    /**
     * Getter method for the {@link #height}.
     *
     * @return height Height of the {@link TreeNode}.
     */
    int getHeight() {
        return height;
    }

    /**
     * Setter method for the {@link #height}.
     *
     * @param height Height of the {@link TreeNode}.
     */
    void setHeight(int height) {
        this.height = height;
    }

    /**
     * Getter method of the {@link #left}.
     *
     * @return left Left {@link TreeNode}.
     */
    TreeNode getLeft() {
        return left;
    }

    /**
     * Setter method of the {@link #left}.
     *
     * @param left Left {@link TreeNode}.
     */
    void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * Getter method of the {@link #right}.
     *
     * @return right Right {@link TreeNode}.
     */
    TreeNode getRight() {
        return right;
    }

    /**
     * Setter method of the {@link #right}.
     *
     * @param right Right {@link TreeNode}.
     */
    void setRight(TreeNode right) {
        this.right = right;
    }

    /**
     * Getter mehtod of the {@link #node}.
     *
     * @return node {@link LinkedListNode}.
     */
    LinkedListNode getNode() {
        return node;
    }

    /**
     * Setter method of the {@link LinkedListNode}.
     *
     * @param node {@link LinkedListNode}.
     */
    void setNode(LinkedListNode node) {
        this.node = node;
    }

}