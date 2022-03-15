Feature: Admin Add New Services

  @NewServices
  Scenario: as an Admin, I can add a new services on my menu service list
    When I input data form with tittle "service 1" and description "layanan 1" and price "10000" and upload "Men-Shoes.png"
    Then the services added