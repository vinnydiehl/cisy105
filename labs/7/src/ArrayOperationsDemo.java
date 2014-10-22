/**
 * A demonstration of the ArrayOperations class.
 * Lab 7 - 22 October 2014
 *
 * @author Vinny Diehl
 */

package src;

// My ArrayOperations class
import src.ArrayOperations;

// Built-in array functions
import java.util.Arrays;

public class ArrayOperationsDemo
{
    public static void main(String[] args)
    {
        int[] ints = new int[] { 3, 2, 12, 4, 35, 17, 40, 5 };
        System.out.println("ints: " + Arrays.toString(ints) +
                           "\nTotal: " + ArrayOperations.getTotal(ints) +
                           "\nAverage: " + ArrayOperations.getAverage(ints) +
                           "\nHighest: " + ArrayOperations.getHighest(ints) +
                           "\nLowest: " + ArrayOperations.getLowest(ints));

        long[] longs = new long[] { 45, 23, 19, 2, 4, 8, 32, 9 };
        System.out.println("\nlongs: " + Arrays.toString(longs) +
                           "\nTotal: " + ArrayOperations.getTotal(longs) +
                           "\nAverage: " + ArrayOperations.getAverage(longs) +
                           "\nHighest: " + ArrayOperations.getHighest(longs) +
                           "\nLowest: " + ArrayOperations.getLowest(longs));

        float[] floats = new float[] { 4.3F, 2.3F, 1F, 87.3F, 33F };
        System.out.println("\nfloats: " + Arrays.toString(floats) +
                           "\nTotal: " + ArrayOperations.getTotal(floats) +
                           "\nAverage: " + ArrayOperations.getAverage(floats) +
                           "\nHighest: " + ArrayOperations.getHighest(floats) +
                           "\nLowest: " + ArrayOperations.getLowest(floats));

        double[] doubles = new double[] { 3.2, 3.5, 30.0, 23.4, 22.1 };
        System.out.println("\ndoubles: " + Arrays.toString(doubles) +
                           "\nTotal: " + ArrayOperations.getTotal(doubles) +
                           "\nAverage: " + ArrayOperations.getAverage(doubles) +
                           "\nHighest: " + ArrayOperations.getHighest(doubles) +
                           "\nLowest: " + ArrayOperations.getLowest(doubles));
    }
}
