Feature: Ordering drinks

  Background:
    Given Seb who wants to create an Order
    When Jean-Michel is declared as recipient

  Scenario: Creating an empty order
    Then the order does not contain any drinks

  Scenario: Adding a drink to an order
    When a "PepsaCoke Zero" is added to the order
    Then the order contains 1 drink

  Scenario: Checking the contents of an order
    When a "PepsaCoke Zero" is added to the order
      And a "DietCola Max" is added to the order
      And another "PepsaCoke Zero" is added to the order
    Then the order contains 3 drinks
      And the order contains 2 "PepsaCoke Zero"
      And the order contains 1 "DietCola Max"
