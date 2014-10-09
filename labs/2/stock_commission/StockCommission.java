/**
 * Calculates the commission paid to a stock broker for the purchase of a
 * specific stock.
 *
 * Lab 2 - 15 September 2014
 *
 * @author Vinny Diehl
 */

public class StockCommission
{
    public static void main(String[] args)
    {
        float stockPrice = 1000 * 25.5F;
        float commission = .02F * stockPrice;

        System.out.printf("Stock price: $%.2f\n", stockPrice);
        System.out.printf("Commission: $%.2f\n", commission);
        System.out.printf("Total price: $%.2f\n", stockPrice + commission);
    }
}

/*
 * Pseudocode:
 * stockPrice = 1000 * 25.5
 * commission = 2% * stockPrice
 *
 * print "Stock price: " + stockPrice formatted as monetary value
 * print "Commission: " + commission formatted as monetary value
 * print "Total price: " + (stockPrice + commission) formatted as monetery value
 */

/*
 * Output:
 * Stock price: $25500.00
 * Commission: $510.00
 * Total price: $26010.00
 */
