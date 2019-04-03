Feature: Escalations (Stage 1 to Stage 3 (Copy)

Scenario: Escalation Logs successful submission
Given I launch this url:  https://releasetesting-self.achieveservice.com/login/?support
When I click on Cta Test Real Fam
Then Self dashboard is displayed
When I click on Cta Services from the top Navs
And I click on Cta Escalation Test Process 23022018
Then Escalation Form One is displayed
When I entered Reference number in the Text field
And I click Cta Submit
Then Submission successful page is displayed
When I click on Cta MyRequests V3
Then My Request page is displayed with Data logs
And I enter Case ID in the Search field
And I click search
Then the case log info is display with stage 3 indicated
