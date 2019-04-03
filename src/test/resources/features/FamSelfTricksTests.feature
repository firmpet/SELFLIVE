Feature: FAM SELF - Tricks Tests (Copy)

Scenario Outline:
Given I launch this url: https://releasetesting-self.achieveservice.com/en
When I click on Cta Services
And Services dashboard is displayed
And I click on Cta Useful Tricks Manual Test
And I click on Cta Log In
And I click on Cta Test Real Fam
Then Useful Tricks Forms page is displayed
When I enter <TypeSomeText> and <TypeSomeText1>
And I select Yes from the dropdown field
And I enter 3 and 2 in the fields respectively
And I select Date of birth in the field
And I enter <postcode> in the field
And I enter <validPostcode> in the field
And I click Cta Submit
Then Successful submission page is displayed
Examples:
|TypeSomeText| |TypeSomeText| |postcode| |validPostcode|
|Testing     | |Testers     | |EC2A 2DT| |Validate     |
