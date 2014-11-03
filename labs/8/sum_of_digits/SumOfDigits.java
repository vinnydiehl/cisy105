/**
 * Calculates the sum of the digits in an input string.
 * Lab 8 - 03 November 2014
 *
 * @author Vinny Diehl
 */

import java.util.Scanner;

public class SumOfDigits
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        String input = inputDouble("Enter number:");

        // Max and min start where they do because now we can test whether each
        // digit is higher or lower than what is there.
        int sum = 0, max = 0, min = 9;
        for (int i = 0; i < input.length(); ++i)
        {
            int digit = input.charAt(i) - '0';

            sum += digit;
            if (digit > max)
                max = digit;
            if (digit < min)
                min = digit;
        }

        System.out.printf("\nSum: %d\nHighest: %d\nLowest: %d\n",
                          sum, max, min);
    }

    /**
     * Prompts the user for a double and keeps asking until it receives a
     * double. Returns a String of the input.
     *
     * @param prompt the prompt to show the user
     * @return the user's input as a String
     */
    public static String inputDouble(String prompt)
    {
        prompt += ' ';

        System.out.print(prompt);
        // Keep showing the prompt until they enter a double
        while (!s.hasNextDouble())
        {
            System.out.print(prompt);
            s.next();
        }

        return s.nextLine();
    }
}
