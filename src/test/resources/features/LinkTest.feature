@reg
Feature: LINK Test

Scenario: Link
Given I launch this url: https://releasetesting-self.achieveservice.com/en
When I click on Cta Services
And I click on Cta Log In
Then New Form page is displayed
