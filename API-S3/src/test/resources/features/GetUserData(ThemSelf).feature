Feature: I can call data themself

  @UserThemself
  Scenario: as registered account, I can check my own data
    When I try to call endpoint of mine
    Then the API give response and i can get result of my own data