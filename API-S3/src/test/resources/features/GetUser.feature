Feature: Get User

  @SignIn
  Scenario: I can check user data
    When I input my email is "QE---2@xx.com" and password is "QExx(*&"
    Then I can login to page