Feature: FAM SELF - Escalation Stage 1 15mins till Stage 3 (Copy)

Scenario Outline: 
Given I launch this url: https://releasetesting-self.achieveservice.com/appshost/firmstep/self/apps/services/?language=en
When I click on Cta Escalation Test Process 23022018
And I click on Cta Log In
And I click on Cta Test Real Fam
Then Escalation Form One page is displayed
When I enter <EnterSomeText> field
And click Cta Submit
Then successful submission page is displayed with reference number
Examples:
|EnterSomeText |
|test          |
