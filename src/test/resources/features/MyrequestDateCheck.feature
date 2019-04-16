@rege
Feature: Myrequests - [Date Check] (Copy)

Scenario: MyRequest Date Check
  #Given I login with valid credentials
  Given I launch this url: https://releasetesting-self.achieveservice.com/service/Myrequests_date_check
When I enter <text1> field
And I click on Cta Submit
Then Reference and submission successful message is displayed
When I click Cta Continue
Then Survey page is displayed
When I click top nav MyRequests V3
And my My Request page is displayed
And I enter into <searchField>
And I click search
Then the result is displayed

