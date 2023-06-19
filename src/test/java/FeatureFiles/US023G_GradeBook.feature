
Feature: Grade Feature test case


Background:

  Given Navigate to campus
  And Enter username and password and Login click
  Then Verify succesfully loged

  Scenario: Giving notes to students

    And I Click on Geography Details button
    And I Click on Grade Book button
    When I Enter the notes for a specific student
    Then The notes should be successfully saved