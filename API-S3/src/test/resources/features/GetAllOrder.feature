Feature: Admin checks all incoming orders

  @AllIncomingOrders
  Scenario: as an Admin, I want to check all incoming orders
    When I try to check all data incoming orders
    Then the API give response and i see all data incoming orders