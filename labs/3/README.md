# Lab 3

To run these programs, simply run `make` from this directory. It will compile
and run all 3 programs for this lab. Here is an example output for a given
input (inputs are for the first section of the Payroll class demo):

    ---------- RetailItem Demo ----------
    Item 1:
     - Description: Jacket
     - Units on hand: 12
     - Price: $59.95
    Item 2:
     - Description: Designer Jeans
     - Units on hand: 40
     - Price: $34.95
    Item 3:
     - Description: Shirt
     - Units on hand: 20
     - Price: $24.95

    ---------- Payroll Demo ----------
    Enter name: Vinny
    Enter ID: 42
    Enter hourly pay: 35.83
    Enter hours worked: 35.25

    Payroll for Vinny (ID #42):
     - Hourly pay:   $35.83
     - Hours worked:  35.25
     - Gross pay:    $1263.01

Page 189: Problems 5 and 6

## 5. `RetailItem` Class

Write a class named `RetailItem` that holds data about an item in a retail
store. The class should have the following fields:

 * `description`: a `String` object that holds a brief description of the item.
 * `unitsOnHand`: an `int` that holds the number of units currently in the
   inventory.
 * `price`: a `double` that holds the item's retail price.

Write appropriate mutator methods that store values in these fields and accessor
methods that return the values in these fields. Once you have written the class,
write a separate program that creates three `RetailItem` objects and stores the
following data in them.

| Item # | `description`  | `unitsOnHand` | `price` |
| :----: | -------------- | ------------- | ------- |
|   1    | Jacket         | 12            | 59.95   |
|   2    | Designer Jeans | 40            | 34.95   |
|   3    | Shirt          | 20            | 24.95   |

## 6. `Payroll` Class

Design a `Payroll` class that has fields for an employee's:

 * name
 * ID number
 * hourly pay rate
 * number of hours worked

Write the appropriate accessor and mutator methods and a constructor that
accepts the employee's name and ID number as arguments.

The class should also have a method that returns the employee's gross pay, which
is calculated as the number of hours worked multiplied by the hourly pay rate.

Write a program that demonstrates the class by creating a `Payroll` object, then
asking the user to enter the data for an employee. The program should display
the amount of gross pay earned.
