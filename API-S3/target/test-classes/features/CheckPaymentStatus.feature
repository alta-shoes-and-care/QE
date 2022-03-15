Feature: User try to check payment status

  @PaymentStatus
  Scenario: as an User, I want to check my payment status
    When I want to check my status of payment of my order
    Then the API give response and I see the payment is success