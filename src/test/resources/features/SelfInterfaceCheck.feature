Feature: Self - Interface Check (Copy)

  Scenario: Interface Check
    Given I launch this url: https://releasetesting-self.achieveservice.com/login/?support
    When I click on Test Rail FAM link
    Then Self dashboard is displayed
    When I click on Cta FAQs
    Then FAQs dashboard is displayed
    When I click on Cta Services
    Then Services dashboard is displayed
    When I click on Cta Dashboard
    Then The Dashboard page is displayed
    When I click on Cta MyRequests V3
    Then MyRequests V3 page is displayed
    When I click on Cta Capita Connect v3
    Then the Capita Connect v3 page is displayed