# Lab 7

To build this program, run `make` in this directory. `make run` will build and
run the program. `make clean` will remove all build artifacts.

Page 543: Problem 11

## 11. `ArrayOperations` Class

Write an `ArrayOperations` class with the following static methods:

 * `getTotal`: This method should accept a one-dimensional array as its
   argument and return the total of the values in the array. Write overloaded
   versions of this method that work with `int`, `float`, `double`, and `long`
   arrays.
 * `getAverage`: This method should accept a one-dimensional array as its
   argument and return the average of the values in the array. Write overloaded
   versions of this method that work with `int`, `float`, `double`, and `long`
   arrays.
 * `getHighest`: This method should accept a one-dimensional array as its
   argument and return the highest value in the array. Write overloaded
   versions of this method that work with `int`, `float`, `double`, and `long`
   arrays.
 * `getLowest`: This method should accept a one-dimensional array as its
   argument and return the lowest value in the array. Write overloaded versions
   of this method that work with `int`, `float`, `double`, and `long` arrays.

Demonstrate the class in a complete program with test data stored in arrays of
various data types.

## Output

The output of `make run` should be as follows:

    ints: [3, 2, 12, 4, 35, 17, 40, 5]
    Total: 118
    Average: 14
    Highest: 40
    Lowest: 2

    longs: [45, 23, 19, 2, 4, 8, 32, 9]
    Total: 142
    Average: 17
    Highest: 45
    Lowest: 2

    floats: [4.3, 2.3, 1.0, 87.3, 33.0]
    Total: 127.9
    Average: 25.58
    Highest: 87.3
    Lowest: 1.0

    doubles: [3.2, 3.5, 30.0, 23.4, 22.1]
    Total: 82.2
    Average: 16.44
    Highest: 30.0
    Lowest: 3.2
