Feature: FAM SELF - HTTP Look Up’s (Copy)

Scenario Outline:
Given I launch this url: https://releasetesting-self.achieveservice.com/en
When I click Cta Services
And Services dashboard is displayed
And I click on Cta HTTP Examples and Testing
And I click on Cta Log In
And I click on Cta Test Real Fam
Then HTTP Testing and Example page is displayed
When I click Cta LookUp in HTTP Get No Token column
And I click Cta Next
Then HTTP Get With Token column page is displayed
And I enter <Breedname> in the field
And I click Cta LookUp
And an Image is displayed
And I click Cta Next1
Then HTTP Subform Population column is displayed
And I click Cta LookUp to fill up the fields
And I click on Cta Submit
Then Successful submission page is displayed with reference
Examples:
|Breedname     |
|affenpinscher |
