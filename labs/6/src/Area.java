/**
 * Has static methods for calculating the area of various geometric figures.
 * Lab 6 - 13 October 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

public class Area
{
    public static double circular(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double circular(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double rectangular(double width, double length)
    {
        return width * length;
    }
    public static double rectangular(double width, double length,
                                         double height)
    {
        return 2 * (width * length + height * length + height * width);
    }
}
