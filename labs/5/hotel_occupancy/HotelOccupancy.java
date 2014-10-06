/**
 * Calculates the occupancy rate for each floor of a hotel.
 * Lab 5 - 06 October 2014
 *
 * @author Vinny Diehl
 */

import java.util.Scanner;

public class HotelOccupancy
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        int floors = inputInt("How many floors does the hotel have?");

        int rooms = 0, occupied = 0;
        // Iterate over the floors
        for (int floor = 1; floor <= floors; ++floor)
        {
            // Build a header with an underline consisting of dashes the same
            // length as the header (subtracts 2 because of the newlines)
            String header = "\nFloor " + floor + '\n';
            header += new String(new char[header.length() - 2]).replace('\0', '-');
            System.out.println(header);

            rooms += inputInt("How many rooms?");
            occupied += inputInt("How many are occupied?");
        }

        System.out.println("\nThe hotel has " + rooms + " rooms.");
        System.out.println((rooms - occupied) + " of them are vacant.");
        System.out.println(occupied + " of them are occupied.");
        System.out.println("The occupancy rate is " +
                           Math.round((double)occupied * 100 / rooms) + "%.");
    }

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
        // Sanity check positive
        return Math.max(0, s.nextInt());
    }
}
