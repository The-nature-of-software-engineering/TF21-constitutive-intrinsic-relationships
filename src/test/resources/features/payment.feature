Feature: Payments can be made between accounts

  Scenario: An account paying another account gets debited
    Given Steven's balance is 10.00 dollars
    When Steven pays Mark 5.00 dollars
    Then Steven's updated balance is 5.00 dollars

  Scenario: An account getting paid by another account gets credited
    Given Mark's balance is 1.00 dollars
    When Steven pays Mark 5.00 dollars
    Then Mark's updated balance is 6.00 dollars