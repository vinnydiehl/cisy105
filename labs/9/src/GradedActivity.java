/**
 * A class that holds a grade for a graded activity.
 */

package src;

public class GradedActivity
{
    protected double score;

    public void setScore(double s) { score = s; }
    public double getScore() { return score; }

    public char getGrade()
    {
        return score >= 90 ? 'A'
             : score >= 80 ? 'B'
             : score >= 70 ? 'C'
             : score >= 60 ? 'D'
             :               'F';
    }
}
