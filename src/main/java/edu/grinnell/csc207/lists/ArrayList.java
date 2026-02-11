package edu.grinnell.csc207.lists;

import java.util.Arrays;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */

    private static int Default_cap = 10;

   
    
    private int[] data;
    private int size;

    public ArrayList(int value){   
        this.data[] = ;
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    public void add(int value) {
        data[size] = value;

    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

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
