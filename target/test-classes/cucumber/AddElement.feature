
@tag
Feature: Add the element by clicking the Add Element button

  @tag2
  Scenario: Add the element by clicking the button Add Element
    Given I open the web page
    When I click the Add and Remove Elements button
    And I verify that I have landed in the Add and Remove elements page 
    And I click the Add Element button
    Then I Verify that Element is added and Delete button is visible
     


