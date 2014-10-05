/**
 * Tracks bank charges.
 *
 * A bank charges $10 per month plus the following check fees for a commercial
 * checking account:
 *
 * <ul>
 *   <li>$.10 for each check if less than 20 checks were written</li>
 *   <li>$.08 for each check if 20 through 39 checks were written</li>
 *   <li>$.06 for each check if 40 through 59 checks were written</li>
 *   <li>$.04 for each check if 60 or more checks were written</li>
 * </ul>
 *
 * The bank also charges an extra $15 if the account balance falls below $400
 * (before any check fees are applied). Design a class that stores the ending
 * balance of an account and the number of checks written. It should also have a
 * method that returns the bank's service fees for the month.
 *
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

public class BankCharges
{
    /*** Constants ***/

    // Same as in SalesTracker, map the amounts of checks to the fees to be
    // charged.
    public static final Map<Integer, Float> FEES;
    static
    {
        // The keys will need to be in descending order as the algorithm checks
        // to see if the value is >= each key
        FEES = new TreeMap<Integer, Float>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2)
                    { return o2.compareTo(o1); }
            });

        // 0+: $.10 fee
        FEES.put(0, 0.1F);
        // 20+: $.08 fee
        FEES.put(20, 0.08F);
        // 40+: $.06 fee
        FEES.put(40, 0.06F);
        // 60+: $.04 fee
        FEES.put(60, 0.04F);
    }

    /*** Instance Variables, Getters/Setters ***/

    private int checksWritten;
    private float endBalance;

    public void setChecksWritten(int checks) { checksWritten = checks; }
    public int getChecksWritten() { return checksWritten; }
    public void setEndBalance(float balance) { endBalance = balance; }
    public float getEndBalance() { return endBalance; }

    /*** Utility Methods ***/

    /**
     * Calculates the monthly service fees for a bank account.
     *
     * @return the service fees for the month
     */
    public float serviceFees()
    {
        // Apply the service charge for the minimum end balance
        float subtotal = endBalance < 400 ? 15 : 0;

        // The key:value pair is checksWrittenMinimum:fee
        for (Map.Entry<Integer, Float> entry : FEES.entrySet())
            if (checksWritten >= entry.getKey())
                // It's iterating backwards, so as soon as it finds what discount
                // class the purchase is in, apply that fee
                return subtotal + entry.getValue() * checksWritten;

        // This should never happen but a negative number would trip it.
        return subtotal;
    }
}
