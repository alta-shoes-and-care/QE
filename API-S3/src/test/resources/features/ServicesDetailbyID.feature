Feature: Admin check services by ID

  @ServiceDetail
  Scenario: as an Admin, I want to check services by ID
    When I try to check services with ID "6"
    Then the API give response and i can see the data services