$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signpage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As user I want to login into  iPlato website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4394351000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should not able to signIn with invalid credentials.",
  "description": "",
  "id": "login-test;user-should-not-able-to-signin-with-invalid-credentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enters \u0027username\u0027 with \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enters \u0027password\u0027 with \"iPlato@1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Error message displayed with wrong username or password",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 168898100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignInLink()"
});
formatter.result({
  "duration": 101832600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 26
    }
  ],
  "location": "MyStepdefs.iEntersUsernameWith(String)"
});
formatter.result({
  "duration": 404469100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iPlato@1234",
      "offset": 26
    }
  ],
  "location": "MyStepdefs.iEntersPasswordWith(String)"
});
formatter.result({
  "duration": 49936900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 365891700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.errorMessageDisplayedWithWrongUsernameOrPassword()"
});
formatter.result({
  "duration": 44034600,
  "status": "passed"
});
formatter.after({
  "duration": 692387900,
  "status": "passed"
});
});