Feature: Ordering drinks

  Scenario: Creating an empty order
    Given Romeo who wants to create an Order
    Then Juliet is declared as recipient
    When the order does not contain any drinks

# En tant que Romeo, Je veux ajouter des boissons à une commande Afin que je puisse les boire

  Scenario: Adding a drink to an order
    Given Tom who wants to create an Order
    When Jerry is declared as recipient
      And a "PepsaCola Zero" is added to the order
    Then the order contains 1 drink

Scenario: Checking the contents of an order
  Given Seb who wants to create an Order
  When Jean-Michel is declared as recipient
    And a "PepsaCoke Zero" is added to the order
    And a "DietCola Max" is added to the order
    And another "PepsaCoke Zero" is added to the order
  Then the order contains 3 drinks
    And the order contains 2 "PepsaCoke Zero"
    And the order contains 1 "DietCola Max"
