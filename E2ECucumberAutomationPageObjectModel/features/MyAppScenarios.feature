#Author: james.ngondo@sap.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test Facebook smoke test

  @tag1
  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" 
    And I pass in a valid "<password>"
    Then User should be able to login successfully
    Then Application should close

    Examples: 
      | username                 | password      |
      | keithchingotah@gmail.com | chingotah1980 |
      | jay20133@outlook.com     | cool12354     |
      | jay20133@outlook.com     | jay101010     |

  @tag2
  Scenario: To populate the contact form
    Given I am on the zoo site
    When I click on "contact"
    And I enter "name" into the name field
    And I enter "address" into the address field
    And I enter "postcode" into the postcode field
    And I enter "email" into the email field
    And I submit the contact form
    Then I check I am on the confirmation page
    And I close the browser
    
    @tag3
  Scenario: To populate the contact form
  	Given I am on the zoo site
    When I click on "contact"
    And I populate the entire contact form at once
    And I submit the contact form
    Then I check I am on the confirmation page
    And I close the browser
