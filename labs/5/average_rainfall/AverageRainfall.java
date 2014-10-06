/**
 * Calculates the average rainfall over a period of years.
 * Lab 5 - 06 October 2014
 *
 * @author Vinny Diehl
 */

import java.util.Scanner;

public class AverageRainfall
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        final String MONTHS[] = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };

        int years = inputInt("How many years would you like to measure?", 1),
            months = years * 12;

        System.out.println("\nEnter the inches of rainfall for each month.");

        int inches = 0;
        for (int year = 1; year <= years; ++year)
        {
            // Build a header with an underline consisting of dashes the same
            // length as the header (subtracts 2 because of the newlines)
            String header = "\nYear " + year + '\n';
            header += new String(new char[header.length() - 2]).replace('\0', '-');
            System.out.println(header);

            for (String month : MONTHS)
                inches += inputInt(month + ':');
        }

        System.out.printf("\n%d\" of rainfall over %d months.\n", inches, months);
        System.out.println("Average rainfall per month is " +
                           Math.round((double)inches / months) + "\".");
    }

    public static int inputInt(String prompt, int min)
    {
        prompt += ' ';

        System.out.print(prompt);
        // Keep showing the prompt until they enter an int
        while (!s.hasNextInt())
        {
            System.out.print(prompt);
            s.next();
        }
        // Sanity check the minimum
        return Math.max(min, s.nextInt());
    }
    public static int inputInt(String prompt)
    {
        // Oh joy, a language without default parameters
        return inputInt(prompt, 0);
    }
}
