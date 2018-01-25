$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataDrivenFramework.feature");
formatter.feature({
  "line": 1,
  "name": "Fill a simple form with excel data",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Data driven with excel",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "click contact us",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I contact the customer service with excel row \"1\" dataset",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "The browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "DataDrivenFramework.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 9063843500,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.click_contact_us()"
});
formatter.result({
  "duration": 985522578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 47
    }
  ],
  "location": "DataDrivenFramework.i_contact_the_customer_service_with_excel_row_dataset(String)"
});
formatter.result({
  "duration": 326205635,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.the_browser_is_closed()"
});
formatter.result({
  "duration": 825359237,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click contact us",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I contact the customer service with excel row \"\u003crow_index\u003e\" dataset",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The browser is closed",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;",
  "rows": [
    {
      "cells": [
        "row_index"
      ],
      "line": 15,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 16,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;2"
    },
    {
      "cells": [
        "3"
      ],
      "line": 17,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;3"
    },
    {
      "cells": [
        "4"
      ],
      "line": 18,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click contact us",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I contact the customer service with excel row \"2\" dataset",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "DataDrivenFramework.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 8175795956,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.click_contact_us()"
});
formatter.result({
  "duration": 1053934467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 47
    }
  ],
  "location": "DataDrivenFramework.i_contact_the_customer_service_with_excel_row_dataset(String)"
});
formatter.result({
  "duration": 439727723,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.the_browser_is_closed()"
});
formatter.result({
  "duration": 753415586,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click contact us",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I contact the customer service with excel row \"3\" dataset",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "DataDrivenFramework.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 7555638058,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.click_contact_us()"
});
formatter.result({
  "duration": 1057706893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 47
    }
  ],
  "location": "DataDrivenFramework.i_contact_the_customer_service_with_excel_row_dataset(String)"
});
formatter.result({
  "duration": 346985652,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.the_browser_is_closed()"
});
formatter.result({
  "duration": 744841184,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click contact us",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I contact the customer service with excel row \"4\" dataset",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "DataDrivenFramework.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 6702462889,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.click_contact_us()"
});
formatter.result({
  "duration": 1088058657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 47
    }
  ],
  "location": "DataDrivenFramework.i_contact_the_customer_service_with_excel_row_dataset(String)"
});
formatter.result({
  "duration": 650089206,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenFramework.the_browser_is_closed()"
});
formatter.result({
  "duration": 790752302,
  "status": "passed"
});
});