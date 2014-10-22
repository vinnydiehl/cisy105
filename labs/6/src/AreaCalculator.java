/**
 * Calculates the area of various geometric figures.
 * Lab 6 - 13 October 2014
 *
 * @author Vinny Diehl
 */

package src;

// My Area class
import src.Area;

// For user input
import java.util.Scanner;

public class AreaCalculator
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Options:\n" +
                           " (1): Circle\n" +
                           " (2): Cylinder\n" +
                           " (3): Rectangle\n" +
                           " (4): Rectangular Prism");
        int shape = inputInt("What shape would you like to measure?");

        System.out.println();

        double area = 0;
        switch (shape)
        {
        case 1:
            area = Area.circular(inputDouble("Radius:"));
            break;
        case 2:
            area = Area.circular(inputDouble("Radius:"), inputDouble("Height:"));
            break;
        case 3:
            area = Area.rectangular(inputDouble("Width:"), inputDouble("Length:"));
            break;
        case 4:
            area = Area.rectangular(
                inputDouble("Width:"),
                inputDouble("Length:"),
                inputDouble("Height:")
            );
            break;
        }

        System.out.printf("\nArea: %.2f\n", area);
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

        // Keep showing the prompt until the input is from 1-4
        int in = 0;
        for (int i = 0; in < 1 || in > 4; ++i)
        {
            if (i > 0)
                System.out.print(prompt);

            // Keep showing the prompt until they enter an int
            while (!s.hasNextInt())
            {
                System.out.print(prompt);
                s.next();
            }
            in = s.nextInt();
        }

        return in;
    }

    /**
     * Prompts the user for a double and keeps asking until it receives a
     * double.
     *
     * @param prompt the prompt to show the user
     * @return the user's input
     */
    public static double inputDouble(String prompt)
    {
        prompt += ' ';

        System.out.print(prompt);
        // Keep showing the prompt until they enter a double
        while (!s.hasNextDouble())
        {
            System.out.print(prompt);
            s.next();
        }

        return s.nextDouble();
    }
}
