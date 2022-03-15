Feature: Review can deleted by Admin

  @DeleteReview
  Scenario: as an Admin, I have the authority to delete reviews
    When I try to delete a review
    Then I can delete the review I want