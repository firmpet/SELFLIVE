@rege
  Feature: Self - Case View

    Scenario: TESTS-52 (Copy) (Copy) (Copy)
      Given I login with valid credentials
      When I navigate to Case View page
      Then Case View should displayed
      When I enter credentials in the fields
      And I click Cta Submit
      Then Submission with reference page is displayed
      When I click Cta MyRequests VThree
      And Searched for reference
      And click Cta Continue
      Then Case view page is displayed
      When I enter new credentials in the fields
      And I click Cta Submit
      Then Submission with reference page is displayed
      When I click on Cta Dashboard
      And Searched for case reference
      Then click Cta Continue
      When I enter credentials in the fields
      And click Cta Continue
      Then results page is displayed with stages number






