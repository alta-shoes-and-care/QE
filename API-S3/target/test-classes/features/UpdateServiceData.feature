Feature: Data Service Update

  @UpdateDataService
  Scenario: as an Admin I want to update the data service
    When I try to update the data service title to "service_updated" and service description to "description_updated"
    And service ID to 5 and price to 35000
    Then the data services up to date