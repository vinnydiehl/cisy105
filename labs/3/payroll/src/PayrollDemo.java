/**
 * Demonstration of the Payroll class.
 * Lab 3 - 22 September 2014
 *
 * @author Vinny Diehl
 */

package src;

// My Payroll class
import src.Payroll;

// For text input
import java.util.Scanner;
// For the clean formatting of decimal output
import java.text.DecimalFormat;

public class PayrollDemo
{ // begin PayrollDemo
  // ick, these comments are such a terrible practice, do I really need them?
    public static void main(String[] args)
    { // begin main()
        Scanner s = new Scanner(System.in);
        // Format away trailing zeros
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.print("Enter name: ");
        String name = s.nextLine();

        System.out.print("Enter ID: ");
        // Validate int input
        while (!s.hasNextInt())
        { // begin while
            System.out.print("Enter ID: ");
            s.next();
        } // end while
        int id = s.nextInt();

        System.out.print("Enter hourly pay: ");
        // Validate float input
        while (!s.hasNextFloat())
        { // begin while
            System.out.print("Enter hourly pay: ");
            s.next();
        } // end while
        float hourlyPay = s.nextFloat();

        System.out.print("Enter hours worked: ");
        // Validate float input
        while (!s.hasNextFloat())
        { // begin while
            System.out.print("Enter hours worked: ");
            s.next();
        } // end while
        float hoursWorked = s.nextFloat();

        Payroll employee = new Payroll(name, id, hourlyPay, hoursWorked);

        System.out.println("\nPayroll for " + employee.getName() +
                           " (ID #" + employee.getId() + "):");
        System.out.printf(" - Hourly pay:   $%.2f\n", employee.getHourlyPay());
        System.out.println(" - Hours worked:  " + df.format(employee.getHoursWorked()));
        System.out.printf(" - Gross pay:    $%.2f\n", employee.grossPay());
    } // end main()
} // end PayrollDemo

/*
 * Pseudocode:
 *
 * print "Enter name: "
 * input name
 *
 * print "Enter ID: "
 * input ID, verifying that it's an int
 *
 * print "Enter hourly pay: "
 * input hourlyPay, verifying that it's a float
 *
 * print "Enter hours worked: "
 * input hoursWorked, verifying that it's a float
 *
 * employee = Payroll object initialized with the input values
 *
 * print "\nPayroll for " + employee.name + "(ID #" + employee.id + "):\n"
 * print " - Hourly pay:   $" + employee.hourlyPay rounded to hundreds + "\n"
 * print " - Hours worked:  " + employee.hoursWorked with trailing zeros trimmed + "\n"
 * print " - Gross pay:    $" + employee.grossPay() rounded to hundreds + "\n"
 */

/*
 * Output (for the given input):
 *
 * Enter name: Vinny
 * Enter ID: 42
 * Enter hourly pay: 35.83
 * Enter hours worked: 35.25
 *
 * Payroll for Vinny (ID #42):
 *  - Hourly pay:   $35.83
 *  - Hours worked:  35.25
 *  - Gross pay:    $1263.01
 */
