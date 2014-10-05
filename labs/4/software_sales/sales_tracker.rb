class SalesTracker
  # Bonus: Here's the class in Ruby! How about pseudocode.

  PRICE = 99
  DISCOUNTS = Hash[
    {
      10  => 0.2,
      20  => 0.3,
      50  => 0.4,
      100 => 0.5
    }.sort.reverse
  ]

  @units_sold, @money_made = [0] * 2
  attr_reader :units_sold, :money_made

  def self.price_for(units)
    subtotal = PRICE * units

    DISCOUNTS.each do |amount, discount|
      # It's iterating backwards, so as soon as it finds what discount
      # class the purchase is in, apply that discount
      return subtotal * (1 - discount) if units >= amount
    end

    # Less than 10 items, no discount
    subtotal
  end

  def add_sale(units)
    price = self.class.price_for units

    @units_sold += units
    @money_made += price

    price
  end

  def return_sale(units)
    refund = self.class.price_for units

    @units_sold -= units
    @money_made -= refund

    -refund
  end
end
