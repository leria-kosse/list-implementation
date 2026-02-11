package edu.grinnell.csc207.lists;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {

    /**
     * A single node of a linked list.
     */
    private static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this(value, null);
        }
    }

    /**
     * The first node of the list.
     */
    private Node head;
    private int size;

    /**
     * The constructor for a new empty list.
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return size;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        // non negetive and smaller then size
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;

        
        


        

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
}