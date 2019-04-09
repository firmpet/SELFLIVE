@reg
Feature: FAM Database Test (Copy)
Scenario: Database
Given I click on Cta Database Integration Test
And Database Integration Form One page is displayed
And I select select 1 from dropdown field and I enter text 1 in text 1 field in Select List Check column
Then I click Cta Next
And Read Only SubForm column is displayed
And I click Cta Next1
Then Add a Entry column is displayed
When I fill in text1, FirstNameadd and emailadd fields
And I click Cta Submit button
Then Successful submission page is displayed