/**
 * Processes and displays the results of a soft drink survey.
 * Lab 2 - 15 September 2014
 *
 * @author Vinny Diehl
 */

public class EnergyDrinkConsumption
{ // start EnergyDrinkConsumption
    public static void main(String[] args)
    { // start main()
        int total = 15000;

        System.out.println("One or more energy drinks: " + Math.round(.18 * total));
        System.out.println("Prefer citrus-flavored drinks: " + Math.round(.58 * total));
    } // end main()
} // end EnergyDrinkConsumption

/*
 * Pseudocode:
 *
 * total = 15000
 *
 * print "One or more energy drinks: " + 18% of total rounded to the nearest int
 * print "Prefer citrus-flavored drinks: " 58% of total rounded to the nearest int
 */

/*
 * Output:
 * One or more energy drinks: 2700
 * Prefer citrus-flavored drinks: 8700
 */
