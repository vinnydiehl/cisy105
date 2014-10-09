/**
 * Calculates the commission paid over an entire stock transaction.
 * Lab 2 - 15 September 2014
 *
 * @author Vinny Diehl
 */

public class StockTransactionProgram
{
    final static int AMOUNT = 1000;
    final static float COMMISSION = .02F;

    public static void main(String[] args)
    {
        float buyPrice = AMOUNT * 32.87F,
              sellPrice = AMOUNT * 33.92F,
              buyCommission = COMMISSION * buyPrice,
              sellCommission = COMMISSION * sellPrice;

        System.out.printf("Paid for stock: $%.2f\n", buyPrice);
        System.out.printf("Commission on buy: $%.2f\n", buyCommission);
        System.out.printf("Stock sold for: $%.2f\n", sellPrice);
        System.out.printf("Commission on sell: $%.2f\n", sellCommission);
        System.out.printf("Profit: $%.2f\n", sellPrice - buyPrice -
                                             (buyCommission + sellCommission));
    }
}

/*
 * Pseudocode:
 *
 * constant AMOUNT = 1000
 * constant COMMISSION = 2%
 *
 * buyPrice, sellPrice = AMOUNT * 32.87, AMOUNT * 33.92
 * buyCommission, sellCommission = COMMISSION * buyPrice, COMMISSION * sellPrice
 *
 * # All numeric outputs are formatted as dollar amounts
 * print "Paid for stock: " + buyPrice
 * print "Commission on buy: " + buyCommission
 * print "Stock sold for: " + sellPrice
 * print "Commission on sell: " + sellCommission
 * print "Profit: " + sellPrice - buyPrice - (buyCommission + sellCommission)
 */

/*
 * Output:
 * Paid for stock: $32870.00
 * Commission on buy: $657.40
 * Stock sold for: $33920.00
 * Commission on sell: $678.40
 * Profit: $-285.80
 */
