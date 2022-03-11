Feature: User Login

  @SignIn
  Scenario: as a user, I can do login to page
    When I input my email is "QE---2@xx.com" and password is "QExx(*&"
    Then I can login to page
