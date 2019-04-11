Feature: FAM SELF - Escalation Stage 1 15mins till Stage 3 (Copy)

Scenario: Escalation Test Process Stage One
 #Given I login with valid credentials
  When I click on Cta Escalation Test Process
  Then Escalation Form One page is displayed
  When I enter text in the field
  And click Cta Submit
  Then Display submission page with reference number

