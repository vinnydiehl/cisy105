/**
 * Holds data about an item in a retail store.
 * Lab 3 - 22 September 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

public class RetailItem
{
    private String description;
    private int unitsOnHand;
    private double price;

    // Populate all of the fields with one method
    public void setFields(String description, int unitsOnHand, double price)
    { // begin setFields()
        setDescription(description);
        setUnitsOnHand(unitsOnHand);
        setPrice(price);
    } // end setFields()

    // Getters and setters

    public String getDescription()
    { // begin getDescription()
        return description;
    } // end getDescription()
    public void setDescription(String description)
    { // begin setDescription()
        this.description = description;
    } // end setDescription()

    public int getUnitsOnHand()
    { // begin getUnitsOnHand()
        return unitsOnHand;
    } // end getUnitsOnHand()
    public void setUnitsOnHand(int unitsOnHand)
    { // begin setUnitsOnHand()
        this.unitsOnHand = unitsOnHand;
    } // end setUnitsOnHand()

    public double getPrice()
    { // begin getPrice()
        return price;
    } // end getPrice()
    public void setPrice(double price)
    { // begin setPrice()
        this.price = price;
    } // end setPrice()
} // end RetailItem
