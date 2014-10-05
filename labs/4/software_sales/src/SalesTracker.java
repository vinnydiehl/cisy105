/**
 * Tracks sales of a specific software package.
 * Lab 4 - 29 September 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

// Map sorting
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SalesTracker
{
    /*** Constants ***/

    public static final byte PRICE = 99;

    // An easily iterable table of the wholesale discounts available.
    public static final Map<Integer, Float> DISCOUNTS;
    static
    {
        // The keys will need to be in descending order as the algorithm checks
        // to see if the value is >= each key
        DISCOUNTS = new TreeMap<Integer, Float>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2)
                    { return o2.compareTo(o1); }
            });

        // 10+: 20% off
        DISCOUNTS.put(10, 0.2F);
        // 20+: 30% off
        DISCOUNTS.put(20, 0.3F);
        // 50+: 40% off
        DISCOUNTS.put(50, 0.4F);
        // 100+: 50% off
        DISCOUNTS.put(100, 0.5F);
    }

    /*** Fields and Getters ***/

    private int unitsSold = 0;
    private float moneyMade = 0;

    public int getUnitsSold() { return unitsSold; }
    public float getMoneyMade() { return moneyMade; }

    /*** Utility Methods ***/

    public static float priceFor(int units)
    {
        float subtotal = PRICE * units;

        // The key:value pair is amount:discount
        for (Map.Entry<Integer, Float> entry : DISCOUNTS.entrySet())
            if (units >= entry.getKey())
                // It's iterating backwards, so as soon as it finds what discount
                // class the purchase is in, apply that discount
                return subtotal * (1 - entry.getValue());

        // Less than 10 items
        return subtotal;
    }

    /*** Modifiers ***/

    public float addSale(int units)
    {
        float price = priceFor(units);

        unitsSold += units;
        moneyMade += price;

        return price;
    }
    public float returnSale(int units)
    {
        float refund = priceFor(units);

        unitsSold -= units;
        moneyMade -= refund;

        return -refund;
    }
}
