Feature: Admin check all Payment Method List

  @AllPaymentMethod
  Scenario: as an Admin, I want to check all the Payment Method
    When I try to check all list  at Payment Method
    Then the API give response and i see all Payment Method on list