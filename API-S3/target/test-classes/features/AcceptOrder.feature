Feature: Admin can Accept The Incoming Order

  @AcceptOrder
  Scenario: as an Admin, I can accept Order
    When I want to accept the Order with User_ID 162
    Then the API give response and The Order Changed tobe Status "Accepted"