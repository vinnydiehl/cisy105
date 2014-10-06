# Lab 4

To run these programs, simply run `make` from this directory. It will compile
and run the demo programs for this lab.

Page 274: Problems 4 and 5

## 4. Software Sales

A software company sells a package that retails for $99. Quantity discounts are
given according to the following table:

| Quantity | Discount |
| -------: | :------: |
|    10-19 |    20%   |
|    20-49 |    30%   |
|    50-99 |    40%   |
|     100+ |    50%   |

Design a class that stores the number of units sold and has a method that
returns the total cost of the purchase.

## 5. `BankCharges` Class

A bank charges $10 per month plus the following check fees for a commercial
checking account:

 * $.10 for each check if less than 20 checks were written
 * $.08 for each check if 20 through 39 checks were written
 * $.06 for each check if 40 through 59 checks were written
 * $.04 for each check if 60 or more checks were written

The bank also charges an extra $15 if the account balance falls below $400
(before any check fees are applied). Design a class that stores the ending
balance of an account and the number of checks written. It should also have a
method that returns the bank's service fees for the month.

## Output

The output should appear as follows:

    [vinny@gentoo 4]$ make
    ---------- Software Sales Demo ----------
    SalesTracker.priceFor(2):	$198.00
    SalesTracker.priceFor(11):	$871.20
    SalesTracker.priceFor(35):	$2425.50
    SalesTracker.priceFor(62):	$3682.80
    SalesTracker.priceFor(120):	$5940.00

    Initializing SalesTracker instance `sales`.
     * sales.unitsSold: 0
     * sales.moneyMade: $0.00

    float test_return = sales.addSale(20);
     * sales.unitsSold: 20
     * sales.moneyMade: $1386.00
    Returns the value of that sale:
     * test_return: 1386.0

    float test_return = sales.addSale(2);
     * sales.unitsSold: 22
     * sales.moneyMade: $1584.00
     * test_return: 198.0

    float test_return = sales.addSale(12);
     * sales.unitsSold: 34
     * sales.moneyMade: $2534.40
     * test_return: 950.4

    float test_return = sales.returnSale(12);
     * sales.unitsSold: 22
     * sales.moneyMade: $1584.00
     * test_return: -950.4

    ---------- BankCharges Demo ----------
    Initializing BankCharges instance `acct`.
     * acct.checksWritten:	 0
     * acct.endBalance:	    $0.00
     * acct.serviceFees():	$15.00

    acct.setChecksWritten(0);
    acct.setEndBalance(400F);
     * acct.checksWritten:	 0
     * acct.endBalance:	    $400.00
     * acct.serviceFees():	$0.00

    acct.setChecksWritten(1);
    acct.setEndBalance(400F);
     * acct.checksWritten:	 1
     * acct.endBalance:	    $400.00
     * acct.serviceFees():	$0.10

    acct.setChecksWritten(16);
    acct.setEndBalance(400F);
     * acct.checksWritten:	 16
     * acct.endBalance:	    $400.00
     * acct.serviceFees():	$1.60

    acct.setChecksWritten(23);
    acct.setEndBalance(400F);
     * acct.checksWritten:	 23
     * acct.endBalance:     $400.00
     * acct.serviceFees():	$1.84

    acct.setChecksWritten(23);
    acct.setEndBalance(50F);
     * acct.checksWritten:	 23
     * acct.endBalance:     $50.00
     * acct.serviceFees():	$16.84

    acct.setChecksWritten(45);
    acct.setEndBalance(100F);
     * acct.checksWritten:	 45
     * acct.endBalance:     $100.00
     * acct.serviceFees():	$17.70

    acct.setChecksWritten(60);
    acct.setEndBalance(0F);
     * acct.checksWritten:	 60
     * acct.endBalance:     $0.00
     * acct.serviceFees():	$17.40

    acct.setChecksWritten(100);
    acct.setEndBalance(1000F);
     * acct.checksWritten:	 100
     * acct.endBalance:     $1000.00
     * acct.serviceFees():	$4.00
