Feature: Contact us form
  Scenario: Validate successfully the form
    Given I enter in the contact form
    When I enter the first name
    And I enter the last name
    And I enter the email
    And I enter the comments
    And I click on submit button
    Then a successful message is displayed after submiting the form