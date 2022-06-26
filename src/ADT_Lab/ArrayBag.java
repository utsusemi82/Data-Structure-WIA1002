/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT_Lab;

import static java.lang.Integer.min;
import java.util.Arrays;

/**
 *
 * @author User
 * @param <T>
 */
public final class ArrayBag<T> implements BagInterface<T>{
    
 private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    /**
     * Creates empty bag with default capacity of 25
     */
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }//end consturctor

    /**
     * creates bag with specified capacity no max capacity as not mentioned in
     * the question
     *
     * @param capacity the length of the bag array to be initialized
     */
    public ArrayBag(int capacity) {
        this.bag = (T[]) new Object[capacity];
    }//end constructor

    /**
     * Gets the current number of entries in this bag.
     *
     * @return the integer number of entries currently in the bag
     */
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }//end getCurrentSize

    /**
     * Sees whether this bag is full.
     *
     * @return true if the bag is full, or false if not
     */
    @Override
    public boolean isFull() {
        return numberOfEntries >= bag.length;
    }//end isFull

    /**
     * Sees whether this bag is empty.
     *
     * @return true if the bag is empty, or false if not
     */
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }//end isEmpty

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    @Override
    public boolean add(T newEntry) {
        boolean result = true;
        if (isFull()) {
            result = false;
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }//end add

    /**
     * Removes one unspecified entry from this bag, if possible.
     *
     * @return either the removed entry, if the removal was successful, or null
     */
    @Override
    public T remove() {
        T result = removeEntry(numberOfEntries - 1);
        return result;
    }//end remove

    /**
     * Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    @Override
    public boolean remove(T anEntry) {
        T result = removeEntry(getIndex(anEntry));
        return result.equals(anEntry);
    }//end remove(with parameter)

    /**
     * Removes all entries from this bag.
     */
    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }//end clear()

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    @Override
    public int getFrequencyOf(T anEntry) {
        int freq = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                freq++;
            }
        }
        return freq;
    }//end getFrequencyOf

    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry the entry to locate
     * @return true if this bag contains anEntry, or false otherwise
     */
    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                found = true;
                break;
            }
        }
        return found;
    }//end contains

    /**
     * Retrieves all entries that are in this bag. Page 1 WIA1002/WIB1002 FCSIT,
     * UM
     *
     * @return a newly allocated array of all the entries in the bag
     */
    @Override
    public T[] toArray() {
        return Arrays.copyOf(bag, numberOfEntries);
    }// end toArray

    /**
     * Removes the entry of a specific index
     *
     * @param index the index of entry to be removed
     * @return the removed entry Precondition: index must be >= 0 and bag must
     * not be empty
     */
    private T removeEntry(int index) {
        T result = null;
        if (!isEmpty() && index >= 0) {
            result = bag[index];
            bag[index] = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    }//end removeEntry

    /**
     * Gets the index of a specific entry
     *
     * @param anEntry entry to get index
     * @return index of entry if found, and -1 if not found
     */
    private int getIndex(T anEntry) {
        boolean found = false;
        int index = 0;
        int indexFound = -1;

        while (!found && (index < numberOfEntries)) {
            if (anEntry.equals(bag[index])) {
                indexFound = index;
                found = true;
            }
            index++;
        }
        return indexFound;
    }//end get index

    /**
     * Merges two different bags to form 1 bag
     *
     * @param anotherBag another bag to merge with the first bag used to call
     * the method
     * @return union (merger of both bag)
     */
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        BagInterface<T> union = new ArrayBag<>();
        for (int i = 0; i < bag.length; i++) {
            if (!(bag[i] == null)) {
                union.add(bag[i]); //adds the objects from the first bag into union
            }
        }
        T[] arrayBag = anotherBag.toArray();
        for (int i = 0; i < arrayBag.length; i++) {
            union.add(arrayBag[i]); //adds the object from the other bagg into union
        } //union has all the objects from both bags at this point
        return union;
    }// end union

    /**
     * Finds the intersection of 2 bags and returns it as a new bag
     *
     * @param anotherBag another bag to compare and find the
     * intersection(commonItems) with the first bag
     * @return commonItems(intersection of the 2 bags)
     */
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        BagInterface<T> commonItems = new ArrayBag<>();
        BagInterface<T> noDuplicates1 = removeDuplicate(bag); //get bag of elements with no duplicates for first bag
        BagInterface<T> noDuplicates2 = removeDuplicate(anotherBag.toArray()); //get bag of elements with no duplicates for the second bag
        int minimumFreq = 0; 
        for (int i = 0; i < noDuplicates2.getCurrentSize(); i++) { //loop using size of second bag
            if (noDuplicates1.contains(noDuplicates2.toArray()[i])) { //if first bag contains content of second bag with index i
                int freq1 = getFrequencyOf(bag[getIndex(noDuplicates2.toArray()[i])]); //get frequency of the element in the first bag
                int freq2 = anotherBag.getFrequencyOf(noDuplicates2.toArray()[i]); //get frequency of the element in the second bag
                minimumFreq = min(freq1, freq2); //minimum frequency is updated to the smaller number of both frequencies
                for (int j = 0; j < minimumFreq; j++) { 
                    commonItems.add(noDuplicates2.toArray()[i]); //add the element into the intersection bag
                }
            }
        }
        return commonItems;
    }

    /**
     * Remove duplicate elements from the array and returns a bag of the
     * non-duplicate elements
     *
     * @param aBag which is the array of elements
     * @return noDuplicates which is an ArrayBag
     */
    private BagInterface<T> removeDuplicate(T[] aBag) {
        BagInterface<T> noDuplicates = new ArrayBag<>();
        for (int i = 0; i < aBag.length; i++) {
            if (!(aBag[i] == null) && !noDuplicates.contains(aBag[i])) {
                noDuplicates.add(aBag[i]);
            }
        }
        return noDuplicates;
    }

    /**
     * Returns the difference between objects located in 2 different bags
     *
     * @param aBag which is the bag in which the objects is used to minus from
     * the objects in the first bag
     * @return the difference between 2 bags
     */
    public BagInterface<T> difference(BagInterface<T> aBag) {
        BagInterface<T> difference = new ArrayBag<>();
        for (int i = 0; i < bag.length; i++) {
            if (!(bag[i] == null)) {
                difference.add(bag[i]); //difference now contains all the objects of the first bag
            }
        }
        BagInterface<T> remove = removeDuplicate(aBag.toArray()); //remove now contains non-repeated elements from the other bag 
        for (int i = 0; i < remove.getCurrentSize(); i++) {
            if (difference.contains(remove.toArray()[i])) {//if difference contains remove[i] (array)
                int frequency = aBag.getFrequencyOf(remove.toArray()[i]); //get the frequency of the object in the original bag with repeating elements
                for (int j = 0; j < frequency; j++) {//loop to remove the object from difference
                    if (difference.contains(remove.toArray()[i])) {
                        difference.remove(remove.toArray()[i]); //removes if difference contains remove[i](array)
                    } else {
                        break; //breaks the for loop if it doesn't, else is needed to prevent error in removing null
                    }
                }
            }
        }
        return difference;
    }

}

    
   
