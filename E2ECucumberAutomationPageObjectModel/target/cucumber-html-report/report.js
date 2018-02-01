$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyAppScenarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: james.ngondo@sap.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Test Facebook smoke test",
  "description": "",
  "id": "test-facebook-smoke-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-test;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter valid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I pass in a valid \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Application should close",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "test-facebook-smoke-test;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31,
      "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "keithchingotah@gmail.com",
        "chingotah1980"
      ],
      "line": 32,
      "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "jay20133@outlook.com",
        "cool12354"
      ],
      "line": 33,
      "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;3"
    },
    {
      "cells": [
        "jay20133@outlook.com",
        "jay101010"
      ],
      "line": 34,
      "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter valid \"keithchingotah@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I pass in a valid \"chingotah1980\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Application should close",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTestStepDefinition.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 5803593839,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keithchingotah@gmail.com",
      "offset": 15
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_valid(String)"
});
formatter.result({
  "duration": 391272418,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chingotah1980",
      "offset": 19
    }
  ],
  "location": "SmokeTestStepDefinition.i_pass_in_a_valid(String)"
});
formatter.result({
  "duration": 202984815,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 5224884640,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.application_should_close()"
});
formatter.result({
  "duration": 874590427,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter valid \"jay20133@outlook.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I pass in a valid \"cool12354\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Application should close",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTestStepDefinition.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 5244243678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jay20133@outlook.com",
      "offset": 15
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_valid(String)"
});
formatter.result({
  "duration": 273761265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cool12354",
      "offset": 19
    }
  ],
  "location": "SmokeTestStepDefinition.i_pass_in_a_valid(String)"
});
formatter.result({
  "duration": 182649667,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 971697773,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.application_should_close()"
});
formatter.result({
  "duration": 780453881,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-test;test-login-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter valid \"jay20133@outlook.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I pass in a valid \"jay101010\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Application should close",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTestStepDefinition.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 5434587553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jay20133@outlook.com",
      "offset": 15
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_valid(String)"
});
formatter.result({
  "duration": 102588142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jay101010",
      "offset": 19
    }
  ],
  "location": "SmokeTestStepDefinition.i_pass_in_a_valid(String)"
});
formatter.result({
  "duration": 61211777,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 934387234,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.application_should_close()"
});
formatter.result({
  "duration": 729585752,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "To populate the contact form",
  "description": "",
  "id": "test-facebook-smoke-test;to-populate-the-contact-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I am on the zoo site",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I click on \"contact\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I enter \"name\" into the name field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter \"address\" into the address field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter \"postcode\" into the postcode field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I enter \"email\" into the email field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I submit the contact form",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I check I am on the confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_am_on_the_zoo_site()"
});
formatter.result({
  "duration": 4200505964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contact",
      "offset": 12
    }
  ],
  "location": "SmokeTestStepDefinition.i_click_on(String)"
});
formatter.result({
  "duration": 895817451,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 9
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_into_the_name_field(String)"
});
formatter.result({
  "duration": 135538039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "address",
      "offset": 9
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_into_the_address_field(String)"
});
formatter.result({
  "duration": 170157374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "postcode",
      "offset": 9
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_into_the_postcode_field(String)"
});
formatter.result({
  "duration": 191995971,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 9
    }
  ],
  "location": "SmokeTestStepDefinition.i_enter_into_the_email_field(String)"
});
formatter.result({
  "duration": 123219874,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_submit_the_contact_form()"
});
formatter.result({
  "duration": 555838573,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_check_I_am_on_the_confirmation_page()"
});
formatter.result({
  "duration": 94036034,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 799003504,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "To populate the contact form",
  "description": "",
  "id": "test-facebook-smoke-test;to-populate-the-contact-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "I am on the zoo site",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "I click on \"contact\"",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "I populate the entire contact form at once",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I submit the contact form",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I check I am on the confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_am_on_the_zoo_site()"
});
formatter.result({
  "duration": 4378808084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contact",
      "offset": 12
    }
  ],
  "location": "SmokeTestStepDefinition.i_click_on(String)"
});
formatter.result({
  "duration": 984801285,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_populate_the_entire_contact_form_at_once()"
});
formatter.result({
  "duration": 616761907,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_submit_the_contact_form()"
});
formatter.result({
  "duration": 784958920,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_check_I_am_on_the_confirmation_page()"
});
formatter.result({
  "duration": 71582324,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTestStepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 785483429,
  "status": "passed"
});
});