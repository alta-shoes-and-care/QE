Feature: Admin check all services

  @AllServices
  Scenario: as an Admin, I can all services on my menu service list
    When I check all services list  at "database"
    Then the API give response and i can check the service list