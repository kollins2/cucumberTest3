$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/scenarioTest.feature");
formatter.feature({
  "name": "the background color will change to sky blue",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "1. Sky Blue Background",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioStepsDefination.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioStepsDefination.user_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should able to change background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioStepsDefination.user_Should_able_to_change_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:features/scenarioTest_2.feature");
formatter.feature({
  "name": "the background will change to white",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "2. White Background Change",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@scenarios2"
    }
  ]
});
formatter.step({
  "name": "\"Set SkyWhite Background\" button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "scensrioTest_2StepDefination.button_exists(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "scensrioTest_2StepDefination.i_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "scensrioTest_2StepDefination.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});