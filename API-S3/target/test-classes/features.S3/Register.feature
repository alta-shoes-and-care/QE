Feature: as a new user i can create account


  @register
#  Scenario: as a new user, I need to register myself as a new user to site
#    When user input with name is "Q Q" and email is "QE2@xx.com" and password is "QExx(*&" and user is not admin
#    Then user successes to register

  Scenario: as a new user, I do to register to the page
    When I input my name is "Q Q" and email is "QE2@xx.com" and password is "QExx(*&"
    When  my user is admin
    Then I can do register
