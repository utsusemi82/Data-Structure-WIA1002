/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT_tutorial;

/**
 * Java interface which represents a collection of bid's to install an AC unit
 * @author User
 * @param <T>
 */
public interface BidCollectionInterface<T> {
    
    /**
     * Adds a bid to this collection.
     * @param bid the object to be added into this collection
     * @return true if added, false if added unsuccessfully
     */
    public boolean add(T bid);
    
    /**
     * Returns the bid in this collection with the best yearly cost.
     * @return bestYearlyCost
     */
    public double getBestYearlyCost();
    
    /**
     * Returns the bid in this collection with the best initial cost.
     * The initial cost will be defined as the unit cost plus the installation cost.
     * @return bestInitialCost
     */
    public double getBestInitialCost();
    
    /**
     * Clears all of the items from this collection.
     */
    public void clear();
    
    /**
     * Gets the number of items in this collection
     * @return numberItems
     */
    public int getNumberItems();
    
    /**
     * Sees whether this collection is empty.
     * @return true if collection is empty, false if its not empty
     */
    public boolean isEmpty();
}
