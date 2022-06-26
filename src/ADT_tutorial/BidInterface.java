/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT_tutorial;

/**
 *
 * @author User
 */

/** Java interface which describes a single bid to install an AC unit
 * @param <T>.*/

public interface BidInterface<T> {
    
    /**
     * Returns the name of the company making this bid.
     * Precondition: None
     * Postcondition: The name was returned
     * @return companyName
     */
    public String getCompanyName();
    
    /**
     * Returns the description of the air conditioner that this bid is for.
     * Precondition: None
     * Postcondition: The description was returned
     * @return description
     */
    public String getDescription();
    
    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * @return capacity
     */
    public int getCapacity();
    
    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * @return efficiency
     */
    public int getEfficiency();
    
    /**
     * Returns the cost of this bid's AC.
     * @return costAC
     */
    public double getCostAC();
    
    /**
     * Returns the cost of installing this bid's AC.
     * @return costInstall
     */
    public double getCostIntall();
    
    /**
     * Returns the yearly cost of operating this bid's AC.Precondition: None
     * Postcondition:The yearly cost was returned
     * @param hoursOperated
     * @param energyCost
     * @return costOperating = 12 * tons * energyCost * hoursOperated / SEER
     */
    public double getCostOperating(double hoursOperated, double energyCost);
}
