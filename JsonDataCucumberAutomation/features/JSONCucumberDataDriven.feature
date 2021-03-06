#Author: jamesngondo2013@outlook.com



Feature: Demonstrate the json data formats

  Scenario: Serialization , convert object to json and print its string value
    When I create json string from object and write to file
    Then I print it as a string
    
  Scenario: Access a json string in a file
    When I read json string from a file
    
   Scenario: Serialize DB employee Object to Json
    When I serialize database employee object to json
    Then I read the employee json file
    Then I verify that the objects are serialized properly
    
  @web
  Scenario: Accessing a json data file and filling the web form
    When I open practiceselenium website
    And I read the employee json data file "outputEmployee.json"
    And I fill the form with data from json and submit
    Then I close the browser