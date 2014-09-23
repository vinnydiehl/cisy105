/**
 * Holds data about an employee's payroll.
 * Lab 3 - 22 September 2014
 *
 * @author Vinny Diehl
 * @version 1.0
 */

package src;

public class Payroll
{ // begin Payroll
    private String name;
    private int id;
    private float hourlyPay;
    private float hoursWorked;

    // Populate all of the fields with one method
    public Payroll(String name, int id, float hourlyPay, float hoursWorked)
    { // begin Payroll()
        this.name = name;
        this.id = id;
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    } // end Payroll()

    public float grossPay()
    { // begin grossPay()
        return hoursWorked * hourlyPay;
    } // end grossPay()

    // Getters and setters

    public String getName()
    { // begin getName()
        return name;
    } // end getName()
    public void setName(String name)
    { // begin setName()
        this.name = name;
    } // end setName()

    public int getId()
    { // begin getId()
        return id;
    } // end getId()
    public void setId(int id)
    { // begin setId()
        this.id = id;
    } // end setId()

    public float getHourlyPay()
    { // begin getHourlyPay()
        return hourlyPay;
    } // end getHourlyPay()
    public void setHourlyPay(float hourlyPay)
    { // begin setHourlyPay()
        this.hourlyPay = hourlyPay;
    } // end setHourlyPay()

    public float getHoursWorked()
    { // begin getHoursWorked()
        return hoursWorked;
    } // end getHoursWorked()
    public void setHoursWorked(float hoursWorked)
    { // begin setHoursWorked()
        this.hoursWorked = hoursWorked;
    } // end setHoursWorked()
} // end Payroll
