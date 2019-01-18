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
  "duration": 703525511,
  "status": "passed"
});
formatter.match({
  "location": "JSONFrameWorkExample.i_print_it_as_a_string()"
});
formatter.result({
  "duration": 26190,
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
  "duration": 7424196,
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
  "duration": 14427531357,
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
  "duration": 8219457,
  "status": "passed"
});
formatter.match({
  "location": "JSONFrameWorkExample.i_fill_the_form_with_data_from_json_and_submit()"
});
formatter.result({
  "duration": 115325059609,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: Navigation Commands)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DUBN33945389A\u0027, ip: \u0027192.168.178.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat stepDefinition.JSONFrameWorkExample.i_fill_the_form_with_data_from_json_and_submit(JSONFrameWorkExample.java:96)\r\n\tat ✽.And I fill the form with data from json and submit(JSONCucumberDataDriven.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "JSONFrameWorkExample.i_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});