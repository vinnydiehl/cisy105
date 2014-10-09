/**
 * Holds data about an employee's payroll.
 * Lab 3 - 22 September 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

public class Payroll
{
    private String name;
    private int id;
    private float hourlyPay;
    private float hoursWorked;

    // Populate all of the fields with one method
    public Payroll(String name, int id, float hourlyPay, float hoursWorked)
    {
        this.name = name;
        this.id = id;
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    }

    public float grossPay()
    {
        return hoursWorked * hourlyPay;
    }

    // Getters and setters

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public float getHourlyPay()
    {
        return hourlyPay;
    }
    public void setHourlyPay(float hourlyPay)
    {
        this.hourlyPay = hourlyPay;
    }

    public float getHoursWorked()
    {
        return hoursWorked;
    }
    public void setHoursWorked(float hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
}
