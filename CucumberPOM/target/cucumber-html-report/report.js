$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/i350380/eclipse-workspace/CucumberPOM/src/test/java/com/james/training/CucumberPOM/features/cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber Application Test",
  "description": "",
  "id": "cucumber-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Home Page Contact Us",
  "description": "",
  "id": "cucumber-application-test;validate-home-page-contact-us",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks contact us",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "contact us page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate contact us page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate contact us page heading",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.user_opens_browser()"
});
formatter.result({
  "duration": 14618959800,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_is_on_landing_page()"
});
formatter.result({
  "duration": 492600,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_clicks_contact_us()"
});
formatter.result({
  "duration": 1415882100,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.contact_us_page_is_displayed()"
});
formatter.result({
  "duration": 56000,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.validate_contact_us_page_title()"
});
formatter.result({
  "duration": 12015500,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.validate_contact_us_page_heading()"
});
formatter.result({
  "duration": 37758900,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_browser_is_closed()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User Login Page",
  "description": "",
  "id": "cucumber-application-test;user-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user clicks on signin link",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "signin page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify signin page title",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user login with the following",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 19
    },
    {
      "cells": [
        "keithchingotah@gmail.com",
        "123456"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 13945005800,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.user_clicks_on_signin_link()"
});
formatter.result({
  "duration": 1742516300,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.signin_page_is_displayed()"
});
formatter.result({
  "duration": 109300,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.verify_signin_page_title()"
});
formatter.result({
  "duration": 60500,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.user_login_with_the_following(DataTable)"
});
formatter.result({
  "duration": 288605700,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.click_login_button()"
});
formatter.result({
  "duration": 1667513300,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.user_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 28500,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.verify_the_page_title()"
});
formatter.result({
  "duration": 26200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "User login with correct username and password",
  "description": "",
  "id": "cucumber-application-test;user-login-with-correct-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user clicks on signin link",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "signin page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "verify signin page title",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user enters a valid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user enters a valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "cucumber-application-test;user-login-with-correct-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 39,
      "id": "cucumber-application-test;user-login-with-correct-username-and-password;;1"
    },
    {
      "cells": [
        "keithchingotah@gmail.com",
        "123456"
      ],
      "line": 40,
      "id": "cucumber-application-test;user-login-with-correct-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "User login with correct username and password",
  "description": "",
  "id": "cucumber-application-test;user-login-with-correct-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user clicks on signin link",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "signin page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "verify signin page title",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user enters a valid username \"keithchingotah@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user enters a valid password \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user should see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 13181014100,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.user_clicks_on_signin_link()"
});
formatter.result({
  "duration": 1352966900,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.signin_page_is_displayed()"
});
formatter.result({
  "duration": 30200,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.verify_signin_page_title()"
});
formatter.result({
  "duration": 19400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keithchingotah@gmail.com",
      "offset": 30
    }
  ],
  "location": "SigninSteps.user_enters_a_valid_username(String)"
});
formatter.result({
  "duration": 210148100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 30
    }
  ],
  "location": "SigninSteps.user_enters_a_valid_password(String)"
});
formatter.result({
  "duration": 145185400,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.click_login_button()"
});
formatter.result({
  "duration": 1307233100,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.user_should_see_the_dashboard_page()"
});
formatter.result({
  "duration": 39900,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.verify_the_page_title()"
});
formatter.result({
  "duration": 29200,
  "status": "passed"
});
});