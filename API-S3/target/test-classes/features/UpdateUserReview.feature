Feature: User can Update the Review

  @UpdateUserReview
  Scenario: as a user I want to update my Review
    When I change the rating to "2" and review to "xxx abisss"
    Then rating and review updated