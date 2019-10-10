$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTests.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: raghav seth"
    }
  ],
  "line": 3,
  "name": "Validate OrangeHRM Smoke Test Scenarios",
  "description": "",
  "id": "validate-orangehrm-smoke-test-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7960239256,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Login Page Navigated",
  "keyword": "Given "
});
formatter.match({
  "location": "SmokeTest.navigateLoginPage()"
});
formatter.result({
  "duration": 3697243636,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate OrangeHRM title",
  "description": "",
  "id": "validate-orangehrm-smoke-test-scenarios;validate-orangehrm-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RS"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Correct title should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.validateCorrectTitle()"
});
formatter.result({
  "duration": 9547012,
  "status": "passed"
});
formatter.after({
  "duration": 823661495,
  "status": "passed"
});
});