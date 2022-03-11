Feature: User Update

  @Update
  Scenario: as an user I want to update my current data
    When I change my name as "bambang_aw"
    Then my name changed