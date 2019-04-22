
  Feature: My Requests

    Scenario: Stage Loopback
      Given I login with valid credentials
      When I navigate to Stage Loopback page
      And I click on Cta Stage Loopback
      Then SELF TEST - Loopback page is displayed
      When I click Cta Submit
      Then Reference page is displayed
      When I click on Cta MyRequests VThree
      And I click on current Stage two
      Then click on Cta Continue
      When I click No radio button
      And I click Cta Submit
      Then Submission reference page is displayed


