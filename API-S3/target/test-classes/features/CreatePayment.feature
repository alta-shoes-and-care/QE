Feature: Admin Add Payment

  @NewPayment
  Scenario: as an Admin, I want to add new payment method
    When I create new payment name as "ShopeePay"
    Then I successfull to add the payment method
