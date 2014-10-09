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
    {
        setDescription(description);
        setUnitsOnHand(unitsOnHand);
        setPrice(price);
    }

    // Getters and setters

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }
    public void setUnitsOnHand(int unitsOnHand)
    {
        this.unitsOnHand = unitsOnHand;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}
