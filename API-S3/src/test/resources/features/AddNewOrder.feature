Feature: User Add new Order

  @AddNewOrder
  Scenario: as a new user, I want to Order new services
    When I choose service_ID 1 and I input Qty 1 and select payment_method 1
    And I choose pickup_date "2022-03-20" and I input my address "Jalan Jakarta, Cinere" and I choose city "Depok"
    And Phone_number "08881294701"
    Then I can add order transaction