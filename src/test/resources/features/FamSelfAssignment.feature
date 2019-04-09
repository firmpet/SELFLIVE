@reg
Feature: FAM SELF - Assignment (Copy)

Scenario: Assignment Form submission
Given I click on Cta Dashboard and Assignment Process
And New Form 26-03-2018 page is displayed
And I enter test summary date
And I select email and group from the dropdown fields
And click Cta Submit
Then successful form submission page is displayed
