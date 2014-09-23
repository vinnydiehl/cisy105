/**
 * Demonstration of the RetailItem class.
 * Lab 3 - 22 September 2014
 *
 * @author Vinny Diehl
 */

package src;

// My RetailItem class
import src.RetailItem;

// We'll use an ArrayList to hold the items.
import java.util.ArrayList;

public class RetailItemDemo
{ // begin RetailItemDemo
    public static void main(String[] args)
    { // begin main()
        // We need 3 RetailItem objects
        ArrayList<RetailItem> items = new ArrayList<RetailItem>();
        for (int i = 0; i < 3; ++i)
            items.add(new RetailItem());

        // Populate the objects' fields with the given information
        items.get(0).setFields("Jacket", 12, 59.95);
        items.get(1).setFields("Designer Jeans", 40, 34.95);
        items.get(2).setFields("Shirt", 20, 24.95);

        // Print the information held by each object
        for (int i = 0; i < items.size(); ++i)
        { // begin for
            System.out.println("Item " + (i + 1) + ':');
            System.out.println(" - Description: " +
                               items.get(i).getDescription());
            System.out.println(" - Units on hand: " +
                               items.get(i).getUnitsOnHand());
            System.out.println(" - Price: $" +
                               items.get(i).getPrice());
        } // end for
    } // end main()
} // end RetailItemDemo

/*
 * Pseudocode (behold a fantastic mix of English, Ruby, and Python):
 * items = [RetailItem.new * 3]
 *
 * Set the fields of each item, respectively, to the following values:
 *   1: "Jacket", 12, 59.95
 *   2: "Designer Jeans", 40, 34.95
 *   3: "Shirt", 20, 24.95
 *
 * for item in items:
 *   print "Item " + item number + ":\n"
 *   print " - Description: " + item.description + "\n"
 *   print " - Units on hand: " + item.unitsOnHand + "\n"
 *   print " - Price: $" + item.price + "\n"
 */

/*
 * Output:
 *
 * Item 1:
 *  - Description: Jacket
 *  - Units on hand: 12
 *  - Price: $59.95
 * Item 2:
 *  - Description: Designer Jeans
 *  - Units on hand: 40
 *  - Price: $34.95
 * Item 3:
 *  - Description: Shirt
 *  - Units on hand: 20
 *  - Price: $24.95
 */
