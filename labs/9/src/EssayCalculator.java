/**
 * Calculates the grade a student got on their essay.
 * Lab 9 - 17 November 2014
 *
 * @author Vinny Diehl
 */

package src;

// My Essay class
import src.Essay;

// For user input
import java.util.Scanner;

public class EssayCalculator
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        Essay essay = new Essay(
            inputDouble("Grammar", 30),
            inputDouble("Spelling", 20),
            inputDouble("Length", 20),
            inputDouble("Content", 30)
        );

        System.out.printf("\nScore: %d\nGrade: %c\n",
                          Math.round(essay.getScore()), essay.getGrade());
    }

    /**
     * Prompts the user for a double and keeps asking until it receives a
     * double less than +max+.
     *
     * @param prompt the prompt to show the user
     * @return the user's input
     */
    public static double inputDouble(String prompt, double max)
    {
        prompt += ": ";

        // Start the input tracker above the max and loop until it's lowered
        double in = max + 1;
        while (in > max)
        {
            System.out.print(prompt);

            // Keep showing the prompt until they enter a double
            while (!s.hasNextDouble())
            {
                System.out.print(prompt);
                s.next();
            }

            in = s.nextDouble();
        }

        return in;
    }
}
