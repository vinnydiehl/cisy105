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
    /**
     * Returns the area of a circle.
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double circular(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Returns the area of a cylinder.
     *
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @return the area of the cylinder
     */
    public static double circular(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Returns the area of a rectangle.
     *
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     * @return the area of the rectangle
     */
    public static double rectangular(double width, double length)
    {
        return width * length;
    }

    /**
     * Returns the area of a rectangular prism.
     *
     * @param width the width of the rectangular prism
     * @param length the length of the rectangular prism
     * @param height the height of the rectangular prism
     * @return the area of the rectangular prism
     */
    public static double rectangular(double width, double length,
                                     double height)
    {
        return 2 * (width * length + height * length + height * width);
    }
}
