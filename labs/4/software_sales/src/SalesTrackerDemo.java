/**
 * Demonstration of the SalesTracker class.
 * Lab 4 - 29 September 2014
 *
 * @author Vinny Diehl
 */

package src;

// My SalesTracker class
import src.SalesTracker;

public class SalesTrackerDemo
{
    public static void main(String[] args)
    {
        /*** Demonstrate SalesTracker.priceFor() ***/

        // Iterate over several tests covering each discount range
        int priceForTests[] = { 2, 11, 35, 62, 120 };
        for (int test : priceForTests)
            System.out.printf("SalesTracker.priceFor(%d):\t$%.2f\n",
                              test, SalesTracker.priceFor(test));

        /*** Demonstrate Functionality of SalesTracker Instance ***/

        System.out.println("\nInitializing SalesTracker instance `sales`.");
        SalesTracker sales = new SalesTracker();
        printFields(sales);

        int addReturnSaleTests[] = { 20, 2, 12, 12 };
        int length = addReturnSaleTests.length;

        for (int i = 0; i < length; ++i)
        {
            int test = addReturnSaleTests[i];

            // Make the last demonstration do a return, the rest are sales
            boolean last = i == length - 1;
            System.out.printf("\nfloat test_return = sales.%s(%d);\n",
                              last ? "returnSale" : "addSale", test);
            float test_return =
                last ? sales.returnSale(test) : sales.addSale(test);

            printFields(sales);

            // Don't want this on all of them cluttering up the output
            if (i == 0)
                System.out.println("Returns the value of that sale:");

            System.out.println(" * test_return: " + test_return);
        }
    }

    private static void printFields(SalesTracker tracker)
    {
        System.out.println(" * sales.unitsSold: " + tracker.getUnitsSold());
        System.out.printf(" * sales.moneyMade: $%.2f\n", tracker.getMoneyMade());
    }
}
