/**
 * Demonstration of the BankCharges class.
 * Lab 4 - 29 September 2014
 *
 * @author Vinny Diehl
 */

package src;

// My BankCharges class
import src.BankCharges;

public class BankChargesDemo
{
    public static void main(String[] args)
    {
        /*** Demonstrate Functionality of BankCharges Instance ***/

        System.out.println("Initializing BankCharges instance `acct`.");
        BankCharges acct = new BankCharges();
        printInfo(acct);

        int tests[][] = {
            { 0, 400 },
            { 1, 400 },
            { 16, 400 },
            { 23, 400 },
            { 23, 50 },
            { 45, 100 },
            { 60, 0 },
            { 100, 1000 }
        };

        for (int test[] : tests)
        {
            System.out.printf("\nacct.setChecksWritten(%d);\n", test[0]);
            acct.setChecksWritten(test[0]);

            System.out.printf("acct.setEndBalance(%dF);\n", test[1]);
            acct.setEndBalance((float)test[1]);

            printInfo(acct);
        }
    }

    private static void printInfo(BankCharges acct)
    {
        System.out.println(" * acct.checksWritten:\t " + acct.getChecksWritten());
        System.out.printf(" * acct.endBalance:\t$%.2f\n", acct.getEndBalance());
        System.out.printf(" * acct.serviceFees():\t$%.2f\n", acct.serviceFees());
    }
}
