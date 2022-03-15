Feature: User Login

  @SignIn
  Scenario: as a user, I can do login to page
    When I input my email is "uA/@ucup.com" and password is "io977"
    Then I can login to page
