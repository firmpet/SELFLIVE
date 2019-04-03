Feature: FAM Database Test (Copy)

Scenario Outline:
Given I launch this url: https://releasetesting-self.achieveservice.com/appshost/firmstep/self/apps/services/?language=en
When I click on Cta Data Integration Test
Then Log In page is displayed
And I click on Cta Log In
And Portals Page is displayed
When I click on Cta Test Real Fam
And Database Integration Form One page is displayed
And I select <select 1> from dropdown field and I enter <text 1> in text 1 field in Select List Check column
Then I click Cta Next
And Read Only SubForm column is displayed
And I click Cta Next
Then Add a Entry column is displayed
When I fill in <text1>, <FirstNameadd> and <emailadd> fields
And I click Cta Submit
Then Successful submission page is displayed
Examples:
|select 1 | |text 1               | |text1| |FirstNameadd| |emailadd         |
|test     | |support@firmstep.com | |Dan  | |David       | |test@example.com |