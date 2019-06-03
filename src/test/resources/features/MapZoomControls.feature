@reg
  Feature: Map Zoom Controls
    Scenario: User is able to interact with Map zoom
      Given I login with valid credentials
      When User navigate to "MapZoom" page
      And User control the first map section
      And User control the second map section
      And I click Cta Submit
      Then Submission page is displayed
