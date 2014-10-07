# Lab 5

To run these programs, simply run `make` from this directory. It will compile
and run all demo programs for this lab.

Pages 349-350: Problems 5 and 7

## 5. Hotel Occupancy

A hotel's occupancy rate is calculated as follows:

> *Occupancy rate = number of rooms occupied / total number of rooms*

Write a program that calculates the occupancy rate for each floor of a hotel.
The program should start by asking for the number of floors that the hotel has.
A loop should then iterate once for each floor. During each iteration, the loop
should ask the user for the number of rooms on the floor and how many of them
are occupied. After all the iterations, the program should display the number of
rooms the hotel has, the number that are occupied, the number that are vacant,
and the occupancy rate for the hotel.

## 7. Average Rainfall

Write a program that uses nested loops to collect data and calculate the average
rainfall over a period of years. The program should first ask for the number of
years. The outer loop will iterate once for each year. The inner loop will
iterate 12 times, once for each month. Each iteration of the inner loop will ask
the user for the inches of rainfall for that month.

After all iterations, the program should display the number of months, the total
inches of rainfall, and the average rainfall per month for the entire period.

*Input Validation: Do not accept a number less than 1 for the number of years.
Do not accept negative numbers for the monthly rainfall.*

## Output

The output should be as follows:

    [vinny@gentoo 5]$ make
    ---------- Hotel Occupancy ----------
    How many floors does the hotel have? 4

    Floor 1
    -------
    How many rooms? 10
    How many are occupied? 4

    Floor 2
    -------
    How many rooms? 10
    How many are occupied? 7

    Floor 3
    -------
    How many rooms? 10
    How many are occupied? 3

    Floor 4
    -------
    How many rooms? j
    How many rooms? testing input validation
    How many rooms? How many rooms? How many rooms? 8
    How many are occupied? 3

    The hotel has 38 rooms.
    21 of them are vacant.
    17 of them are occupied.
    The occupancy rate is 45%.

    ---------- Average Rainfall ----------
    How many years would you like to measure? 3

    Enter the inches of rainfall for each month.

    Year 1
    ------
    January: 3
    February: 5
    March: 9
    April: 7
    May: 5
    June: 4
    July: 2
    August: 3
    September: 1
    October: 2
    November: 2
    December: 3

    Year 2
    ------
    January: 3
    February: 5
    March: 6
    April: 6
    May: 9
    June: 5
    July: 4
    August: 2
    September: 3
    October: 2
    November: 2
    December: 1

    Year 3
    ------
    January: 2
    February: 4
    March: 3
    April: 5
    May: 5
    June: 4
    July: 5
    August: 3
    September: 3
    October: 2
    November: 3
    December: 3

    136" of rainfall over 36 months.
    Average rainfall per month is 4".
