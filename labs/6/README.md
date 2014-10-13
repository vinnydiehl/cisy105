# Lab 6

To build this program, run `make` in this directory. `make run` will build and
run the program. `make clean` will remove all build artifacts.

Pages 441-442: Problem 1

## 1. `Area` Class

Write a class that has three overloaded static methods for calculating the
areas of the following geometric shapes.

 * circles
 * rectangles
 * cylinders

Here are the formulas for calculating the area of the shapes.

> Area of a circle: *Area = πr<sup>2</sup>*

where *π* is `Math.PI` and *r* is the circle's radius

> Area of a rectangle: *Area = Width × Length*  
> Area of a cylinder: *Area = πr<sup>2</sup>h*

where *π* is `Math.PI`, *r* is the radius of the cylinder's base, and *h* is
the cylinder's height

Because the three methods are to be overloaded, they should each have the same
name, but different parameter lists. Demonstrate the class in a complete
program.

## Issues

The three methods above are impossible to put together in a completely
overloaded manner, say an overloaded `area()` class that can magically tell the
difference between `(double radius, double height)` and `(double width, double
length)`. One way to work around this would be to use a different data type for
one of the two, but that is stupid and inconsistent, I won't have that kind of
sloppy code.

My solution was to implement two sets of overloaded methods that give both two-
and three-dimensional area of circular and rectangular areas.

The result is a `circular()` method that can calculate the area of a circle and
a cylinder, and a `rectangular()` method that can do the same for a rectangle
and a rectangular prism.

## Output

Below is an example of the program's output for various inputs.

    [vinny@gentoo 6]$ make -s run Options: (1): Circle (2): Cylinder (3):
    Rectangle (4): Rectangular Prism What shape would you like to measure? 1

    Radius: 3

    Area: 28.27 [vinny@gentoo 6]$ make -s run Options: (1): Circle (2):
    Cylinder (3): Rectangle (4): Rectangular Prism What shape would you like to
    measure? 2

    Radius: 4 Height: 8.3

    Area: 417.20 [vinny@gentoo 6]$ make -s run Options: (1): Circle (2):
    Cylinder (3): Rectangle (4): Rectangular Prism What shape would you like to
    measure? 3

    Width: 25.5 Length: 20.1

    Area: 512.55 [vinny@gentoo 6]$ make -s run Options: (1): Circle (2):
    Cylinder (3): Rectangle (4): Rectangular Prism What shape would you like to
    measure? 4

    Width: 8.2 Length: 20 Height: 9.5

    Area: 863.80
