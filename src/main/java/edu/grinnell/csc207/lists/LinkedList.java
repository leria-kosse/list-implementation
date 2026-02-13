package edu.grinnell.csc207.lists;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {

    /**
     * A single node of a linked list.
     */
    private static class Node {
        // The value stored in this node
        public int value;
        // The next node in the list
        public Node next;

        /**
         * Builds a new node.
         * 
         * @param value the value to store
         * @param next  the next node
         */
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        /**
         * Builds a new node with no next.
         * 
         * @param value the value to store
         */
        public Node(int value) {
            this(value, null);
        }
    }

    /**
     * The first node of the list.
     */
    private Node head;

    /**
     * A variable to keep track of linked list's size.
     */
    private int size;

    /**
     * The constructor for a new empty list. Worst case runtime-O(1)
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Adds <code>value</code> to the end of the list. Worst case runtime-O(n)
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
     * 
     * @return the number of elements in the list. Worst case runtime-O(1)
     */
    public int size() {
        return size;
    }

    /**
     * Returns the value at <code>index</code> in the list. Worst case runtime-O(n)
     * 
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     * @throws IndexOutOfBoundsException if index is out of the range.
     */
    public int get(int index) {
        // non-negative and smaller than size
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    /**
     * Removes the value at <code>index</code> from the list. Worst case
     * runtime-O(n)
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     * @throws IndexOutOfBoundsException if index is out of the range.
     */
    public int remove(int index) {
        int removed;
        // non-negative and smaller than size
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            removed = head.value;
            head = head.next; // Move head pointer to the next node
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removed = current.next.value;
            current.next = current.next.next;
        }
        size--;
        return removed;
    }

    /**
     * Reports whether the list is empty. Worst case runtime-O(1)
     * 
     * @return true or false based on whether teh list is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes all the valuesfrom the list. Worst case
     * runtime-O(n)
     */
    public void clear() {
        for (int i = size - 1; i >= 0; i--) {
            remove(i);
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(30);
        list.add(50);

        System.out.println("Size: " + list.size());
        System.out.println("Removed: " + list.remove(1));
        System.out.println("Get: " + list.get(1));
        System.out.println("Size: " + list.size());
        System.out.println("Get: " + list.get(1));
        list.clear();
        System.out.println("Empty: " + list.isEmpty());
    }
}
