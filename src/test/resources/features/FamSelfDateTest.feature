Feature: FAM SELF - Date Test (Copy)

Scenario Outline:
Given I launch this url: https://releasetesting-self.achieveservice.com/en
When I click on Cta Services
Then Services dashboard is displayed
When I click on Cta Date Fields Manual Test
Then Date Fields Manual Test Form page is displayed
When I enter <dateFrom>, <dateTo> and <time> in the fields
And I enter <DayOfTheWeek>, <DayOfYear>, <WeekOfYear>, <DayName>
And I click Cta submit
Then Submission page should displayed with submitted data
Examples:
|dateFrom    | |dateTo    | |time | |DayOfTheWeek| |DayOfYear| |WeekOfYear| |DayName |
|15/01/2019  | |20/02/2019| |15:20| |15          | |15       | |3         | |Tuesday |
