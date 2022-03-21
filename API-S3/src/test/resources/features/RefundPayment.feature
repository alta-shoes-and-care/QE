Feature: Admin can do refund the payment

  @Refund
  Scenario: as an Admin, I can do refund user payment
    When I want to do refund from user id 156
    Then the API give response and status payment will change to "refund"