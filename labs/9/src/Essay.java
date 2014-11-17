/**
 * A class that does a simple essay grade calculation.
 * Lab 9 - 17 November 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

// Textbook's GradedActivity class
import src.GradedActivity;

public class Essay extends GradedActivity
{
    public Essay(double grammar, double spelling,
                 double length, double content)
    {
        setScore(grammar, spelling, length, content);
    }

    public void setScore(double grammar, double spelling,
                         double length, double content)
    {
        score = grammar + spelling + length + content;
    }
}
