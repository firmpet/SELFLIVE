Feature: FAM SELF - Assignment (Copy)

Scenario: Assignment Form submission
Given I launch this url: https://releasetesting-self.achieveservice.com/en
When I click on Cta Services
And I click on Cta Dashboard and Assignment Process
Then click on Cta Log In
When I click on Cta Test Real Fam
And New Form 26-03-2018 page is displayed
And I enter test summary date
And I select email and group from the dropdown fields
And click Cta Submit
Then successful form submission page is displayed
