$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/featureSteps.feature");
formatter.feature({
  "name": "sign up",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to a application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify user logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on inbox link",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on compose mail image",
  "keyword": "Then "
});
formatter.step({
  "name": "User search for recipient",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters mail title",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on send message button",
  "keyword": "Then "
});
formatter.step({
  "name": "User verify message has been sent successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on logout button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sritapa",
        "pwd011191"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to a application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"sritapa\" username and \"pwd011191\" password",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.verify_user_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on inbox link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_inbox_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on compose mail image",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_compose_mail_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for recipient",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_search_for_recipient()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters mail title",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_enters_mail_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on send message button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_send_message_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify message has been sent successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.User_verify_message_has_been_sent_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.User_clicks_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});