@reg
Feature: FAM SELF - Calculations (Copy)

Scenario: Calculation of multiple sums
Given Services dashboard is displayed
When I click on Cta Calculations Process
Then Calculations Form page is displayed with Contains column
When I enter Footpath, Park, Road and Cycle Track in the field
And I click Cta Next
Then IF statement column is displayed with Extended IF statement as title
And I select Yes from all the three dropdown fields
And I click Cta Next1
Then String Manipulation column page is displayed
And I select Cta Next2
Then Subforms column page is displayed
And I click Cta Add Record
And I entered £30 in the field
And Total sum of the record is displayed
And I click Cta Submit
Then Submission page is displayed
