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
  "line": 6,
  "name": "Serialization , convert object to json and print its string value",
  "description": "",
  "id": "demonstrate-the-json-data-formats;serialization-,-convert-object-to-json-and-print-its-string-value",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I create json string from object and write to file",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I print it as a string",
  "keyword": "Then "
});
formatter.match({
  "location": "JSONFrameWorkExample.i_create_json_string_from_object_and_write_to_file()"
});
formatter.result({
  "duration": 107437900,
  "status": "passed"
});
formatter.match({
  "location": "JSONFrameWorkExample.i_print_it_as_a_string()"
});
formatter.result({
  "duration": 23359,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Access a json string in a file",
  "description": "",
  "id": "demonstrate-the-json-data-formats;access-a-json-string-in-a-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I read json string from a file",
  "keyword": "When "
});
formatter.match({
  "location": "JSONFrameWorkExample.i_read_json_string_from_a_file()"
});
formatter.result({
  "duration": 5277292,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Accessing a json data file and filling the web form",
  "description": "",
  "id": "demonstrate-the-json-data-formats;accessing-a-json-data-file-and-filling-the-web-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I open practiceselenium website",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I read the json data file \"outputEmployee.json\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I fill the form with data from json and submit",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "JSONFrameWorkExample.i_open_practiceselenium_website()"
});
formatter.result({
  "duration": 4725731570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "outputEmployee.json",
      "offset": 27
    }
  ],
  "location": "JSONFrameWorkExample.i_read_the_json_data_file(String)"
});
formatter.result({
  "duration": 5870108,
  "status": "passed"
});
formatter.match({
  "location": "JSONFrameWorkExample.i_fill_the_form_with_data_from_json_and_submit()"
});
formatter.result({
  "duration": 903137567,
  "status": "passed"
});
formatter.match({
  "location": "JSONFrameWorkExample.i_close_the_browser()"
});
formatter.result({
  "duration": 716427736,
  "status": "passed"
});
});