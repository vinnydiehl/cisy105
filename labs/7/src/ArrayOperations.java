/**
 * A collection of static methods for basic math operations on numeric arrays.
 *
 * This isn't nearly as elegent as I hoped it would be with no apparent way to
 * DRY up all of these overloads.
 *
 * Lab 7 - 22 October 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

// Built-in array functions
import java.util.Arrays;

public class ArrayOperations
{
    /**
     * Returns the sum of the values in an array.
     *
     * Note that Java 8 has IntStreams:
     *
     * public static int getTotal(int[] arr)
     * {
     *     return IntStream.of(arr).sum();
     * }
     *
     * But I'll write for Java 7.
     *
     * @param arr an int, float, double, or long array
     * @return the sum of the values in arr
     */
    public static int getTotal(int[] arr)
    {
        int total = 0;

        for (int n : arr)
            total += n;

        return total;
    }
    public static long getTotal(long[] arr)
    {
        long total = 0;

        for (long n : arr)
            total += n;

        return total;
    }
    public static float getTotal(float[] arr)
    {
        float total = 0;

        for (float n : arr)
            total += n;

        return total;
    }
    public static double getTotal(double[] arr)
    {
        double total = 0;

        for (double n : arr)
            total += n;

        return total;
    }

    /**
     * Returns the average of the values in an array.
     *
     * @param arr an int, float, double, or long array
     * @return the average of the values in arr
     */
    public static int getAverage(int[] arr)
    {
        return getTotal(arr) / arr.length;
    }
    public static long getAverage(long[] arr)
    {
        return getTotal(arr) / arr.length;
    }
    public static float getAverage(float[] arr)
    {
        return getTotal(arr) / arr.length;
    }
    public static double getAverage(double[] arr)
    {
        return getTotal(arr) / arr.length;
    }

    /**
     * Returns the highest value in an array.
     *
     * @param arr an int, float, double, or long array
     * @return the highest value in arr
     */
    public static int getHighest(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static long getHighest(long[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static float getHighest(float[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static double getHighest(double[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    /**
     * Returns the lowest value in an array.
     *
     * @param arr an int, float, double, or long array
     * @return the lowest value in arr
     */
    public static int getLowest(int[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }
    public static long getLowest(long[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }
    public static float getLowest(float[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }
    public static double getLowest(double[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }
}
