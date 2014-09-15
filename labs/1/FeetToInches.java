/**
 * Converts feet to inches.
 * Lab 1 - 8 September 2014
 *
 * @author Vinny Diehl
 */

// For text input
import java.util.Scanner;
// For the clean formatting of decimal output
import java.text.DecimalFormat;

public class FeetToInches
{ // start FeetToInches
    public static void main(String[] args)
    { // start main()
        Scanner s = new Scanner(System.in);
        // Format away trailing zeros
        DecimalFormat df = new DecimalFormat("0.#");

        System.out.print("Enter feet: ");
        // Validate double input
        while (!s.hasNextDouble())
        { // begin while
            System.out.print("Enter feet: ");
            s.next();
        } // end while
        double feet = s.nextDouble();

        System.out.println("Inches: " + df.format(feet * 12));
    } // end main()
} // end FeetToInches

/*
 * Pseudocode:
 * input feet
 * print feet * 12
 * end
 */
