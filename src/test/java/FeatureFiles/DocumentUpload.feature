Feature: Attach File Functionality

  Background:

    Given Navigate to campus
    And Enter username and password and Login click
    Then Verify succesfully loged

  Scenario: Document upload
    Given Navigate to Calendar page
    When  click on Add lesson
    And I click on Add Attachments
    And I click on Add Attachfile
    And I have to upload documents
    Then Verify successfully upload
