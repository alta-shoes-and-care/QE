Feature: Admin can delete Services

  @DeleteServices
  Scenario: as an Admin, want to delete data services
    When I try to delete "DataService"
    Then I can delete the data I want