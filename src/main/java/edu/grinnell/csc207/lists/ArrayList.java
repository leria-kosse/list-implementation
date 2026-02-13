package edu.grinnell.csc207.lists;

import java.util.Arrays;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    /**
     * Adds <code>value</code> to the end of the list
     * @param value the value to add to the end of the list
     */

    private static int DEFAULT_CAP = 10;

    private int[] data;

    private int size;


    /** 
     * Makes a new empty ArrayList 
    */
    public ArrayList(){   
        this.data = new int[DEFAULT_CAP];
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }


    /** 
     *  Adds <code>value</code> to the end of the list. Worst case runtime-O(1)
     * 
     * @param value the value to add to the end of the list.
    */
    public void add(int value) {
        ensureCapacity();
        data[size] = value;
        size++;

    }

    /**
     * Returns the size of the arraylist. Worst case runtime-O(1)
     * 
     * @return the number of elements in the list
     */
    public int size() {
        return this.size;
    }

    /**
     * Returns the value at <code>index</code> in the arraylist. Worst case runtime-O(1)
     * 
     * 
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     * @throws IndexOutOfBoundsException if index is out of the range.
     */
    public int get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    /**
     * Removes the value at <code>index</code> from the list. Worst case runtime-O(n)
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     * @throws IndexOutOfBoundsException if index is out of the range.
     */
    public int remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        int removed = data[index];
        for(int i = index; i < size - 1; i++ ){
            data[i] = data[i + 1];

        } 
        size--;
        return removed;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void clear()
    {
        for(int i = size-1; i>=0; i--)
        {
            remove(i);
        }

    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
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


