Feature: Admin Check All User

  @AllUserList
  Scenario: as an Admin, I can view all User data
    When I want to check "UserList"
    Then the API give response and i view all data User