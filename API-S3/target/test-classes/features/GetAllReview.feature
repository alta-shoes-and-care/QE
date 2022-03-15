Feature: Admin check all Reviews

  @AllReviews
  Scenario: as an Admin, I can view all reviews
    When I want to check all "Reviews"
    Then the API give response and i view all data reviews