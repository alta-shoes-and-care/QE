Feature: User want to give a review

  @UserReview
  Scenario: as a user I want to give stars and reviews on my order
    When I finish the order and I can do a review and give a star
    Then the API give response and My review has been submitted