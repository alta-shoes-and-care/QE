Feature: Admin can search User by ID

  @UserbyID
  Scenario: as an Admin, I can find User data by search the ID
    When I try to search userID from endpoint
    Then the API give response and i can Find The UserID