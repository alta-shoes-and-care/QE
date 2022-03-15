Feature: Admin Edit Services Image

  @EditImageServices
  Scenario: as an Admin, I want to update image on the services data
    When I try to upload the image with "shoe repair.png"
    Then the image on services data will change