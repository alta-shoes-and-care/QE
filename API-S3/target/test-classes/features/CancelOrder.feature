Feature: Admin can do cancel on incoming order

  @CancelOrder
  Scenario: as an Admin, I want to cancel the user order
    When I want cancel user order from ID 156
    Then the API give response and status order will change to "cancel"