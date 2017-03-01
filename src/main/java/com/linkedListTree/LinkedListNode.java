package com.linkedListTree;

class LinkedListNode {

    /**
     * reference to the next node in the chain, or null if there isn't one.
     */
    private LinkedListNode next;

    /**
     * Node constructor
     */
    LinkedListNode() {
        next = null;
    }

    /**
     * Node constructor if we want to specify the node to point to.
     *
     * @param _next Next node.
     */
    public LinkedListNode(LinkedListNode _next) {
        next = _next;
    }

    /**
     * Getter method for the {@link LinkedListNode}.
     *
     * @return next Next linked list node.
     */
    LinkedListNode getNext() {
        return next;
    }

    /**
     * Setter method for the {@link LinkedListNode}.
     *
     * @param _next Next linked list node.
     */
    void setNext(LinkedListNode _next) {
        next = _next;
    }
}