# Lab 8

To run these programs, simply run `make` from this directory. It will compile
and run all demo programs for this lab.

Pages 600-601: Problems 6 and 9

## 6. Telemarketing Phone Number List

Write a program that has two parallel arrays of `String` objects. One of the
arrays should hold people's names and the other should hold their phone
numbers. Here are sample contents of both arrays.

| `name`             | `phone`      |
| ------------------ | ------------ |
| `"Harrison, Rose"` | `"555-2234"` |
| `"James, Jean"`    | `"555-9098"` |
| `"Smith, William"` | `"555-1785"` |
| `"Smith, Brad"`    | `"555-9224"` |

The program should ask the user to enter a name or the first few characters of
a name to search for in the array. The program should display all of the names
that match the user's input and their corresponding phone numbers. For example,
if the user enters `"Smith"`, the program should display the following names
and phone numbers from the list:

    Smith, William: 555-1785
    Smith, Brad: 555-9224

### Note

> parallel arrays

Nope!

Parallel arrays are a terrible practice and not the right way to implement
anything at all in a modern language. A `HashMap` is the proper way to do this
in Java.

## 9. Sum of Digits in a String

Write a program that asks the user to enter a series of single digit numbers
with nothing separating them. The program should display the sum of all the
single digit numbers in the string. For example, if the user enters 2514, the
method should return 12, which is the sum of 2, 5, 1, and 4. The program should
also display the highest and lowest digits in the string. *(Hint: Convert the
string to an array.)*

```Ruby
# 3 lines of Ruby:
print "Enter a number: "
arr = STDIN.gets.strip.chars.map &:to_i
puts "
Sum: #{arr.inject :+}
Highest: #{arr.max}
Lowest: #{arr.min}"
```

## Output

The output should be as follows:

    [vinny@gentoo 8]$ make
    ---------- Telemarketing Phone Number List ----------
    Enter a last name or the first few characters of one: Smith

    Smith, Brad: 555-9224
    Smith, William: 555-1785

    ---------- Sum of Digits in a String ----------
    Enter number: 2514

    Sum: 12
    Highest: 5
    Lowest: 1
