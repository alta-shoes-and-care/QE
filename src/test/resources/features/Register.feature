Feature: User Register

@register
Scenario: as a new user, I do to register to the page
When I input my name is "Q-Q" and email is "QE-2@xx.com" and password is "QExx(*&"
Then I can do register