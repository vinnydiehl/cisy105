/**
 * Recursively calculates the sum of all numbers under a given value.
 * Lab 14 - 01 December 2014
 *
 * @author Vinny Diehl
 */

package src;

// For user input
import java.util.Scanner;

public class SumOfNumbers
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = inputInt("Number:");
        System.out.println("Sum: " + sum(n));
    }

    /**
     * Recursively calculates the sum of all ints up to +n+.
     *
     * @param n the number to add up all numbers under
     * @return the sum of all ints from 0 up to n
     */
    public static int sum(int n)
    {
        return n == 1 ? 1 : n + sum(n - 1);
    }

    /**
     * Prompts the user for an int and keeps asking until it receives an int.
     *
     * @param prompt the prompt to show the user
     * @return the user's input
     */
    public static int inputInt(String prompt)
    {
        prompt += ' ';

        System.out.print(prompt);

        // Keep showing the prompt until they enter an int
        while (!s.hasNextInt())
        {
            System.out.print(prompt);
            s.next();
        }

        return s.nextInt();
    }
}
