@reg
Feature: FAM SELF - Database (Copy)

Scenario: Database Copy
Given I click on Cta Database Integration Test
When Database Integration Form One page is displayed
And I select test from dropdown field and I enter email address in text 1 field in Select List Check column
Then I click Cta Next
And Read Only SubForm column is displayed
And I click Cta Next1
Then Add a Entry column is displayed
When I fill in firstaname, lastname and email in the fields
And I click Cta Submit
Then Successful submission page is displayed
