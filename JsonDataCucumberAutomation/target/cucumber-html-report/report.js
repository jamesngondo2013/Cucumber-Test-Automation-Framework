$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JSONCucumberDataDriven.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: jamesngondo2013@outlook.com"
    }
  ],
  "line": 5,
  "name": "Demonstrate the json data formats",
  "description": "",
  "id": "demonstrate-the-json-data-formats",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Serialization , convert object to json and print its string value",
  "description": "",
  "id": "demonstrate-the-json-data-formats;serialization-,-convert-object-to-json-and-print-its-string-value",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I create json string from object and write to file",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I print it as a string",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessJsonFileStepDefinition.i_create_json_string_from_object_and_write_to_file()"
});
formatter.result({
  "duration": 247605400,
  "status": "passed"
});
formatter.match({
  "location": "AccessJsonFileStepDefinition.i_print_it_as_a_string()"
});
formatter.result({
  "duration": 119900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Access a json string in a file",
  "description": "",
  "id": "demonstrate-the-json-data-formats;access-a-json-string-in-a-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I read json string from a file",
  "keyword": "When "
});
formatter.match({
  "location": "AccessJsonFileStepDefinition.i_read_json_string_from_a_file()"
});
formatter.result({
  "duration": 7468700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Serialize DB employee Object to Json",
  "description": "",
  "id": "demonstrate-the-json-data-formats;serialize-db-employee-object-to-json",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I serialize database employee object to json",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I read the employee json file",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I verify that the objects are serialized properly",
  "keyword": "Then "
});
formatter.match({
  "location": "SerializeEmployeeJsonDataFromDB.i_serialize_database_employee_object_to_json()"
});
formatter.result({
  "duration": 301921500,
  "status": "passed"
});
formatter.match({
  "location": "SerializeEmployeeJsonDataFromDB.i_read_the_employee_json_file()"
});
formatter.result({
  "duration": 27500,
  "status": "passed"
});
formatter.match({
  "location": "SerializeEmployeeJsonDataFromDB.i_verify_that_the_objects_are_serialized_properly()"
});
formatter.result({
  "duration": 23500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Accessing a json data file and filling the web form",
  "description": "",
  "id": "demonstrate-the-json-data-formats;accessing-a-json-data-file-and-filling-the-web-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I open practiceselenium website",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I read the employee json data file \"outputEmployee.json\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I fill the form with data from json and submit",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessJsonDataFileAndFillWebFormStepDifinition.i_open_practiceselenium_website()"
});
formatter.result({
  "duration": 21337322700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "outputEmployee.json",
      "offset": 36
    }
  ],
  "location": "AccessJsonDataFileAndFillWebFormStepDifinition.i_read_the_employee_json_data_file(String)"
});
formatter.result({
  "duration": 3828200,
  "status": "passed"
});
formatter.match({
  "location": "AccessJsonDataFileAndFillWebFormStepDifinition.i_fill_the_form_with_data_from_json_and_submit()"
});
formatter.result({
  "duration": 137214325300,
  "status": "passed"
});
formatter.match({
  "location": "AccessJsonDataFileAndFillWebFormStepDifinition.i_close_the_browser()"
});
formatter.result({
  "duration": 1001472000,
  "status": "passed"
});
});