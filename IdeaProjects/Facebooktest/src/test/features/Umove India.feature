# new feature
# Tags: optional
    
Feature: Login to UmoveIndia.Umove India and click on UmoveIndia.Umove logo link after logging in.
         Find any property and click on view more
    
Scenario: UmoveIndia.Umove India Login function
    Given I am on umove india page
    And enter location name in the find property box
    And click on sale button
    And click on first property
    And click on view more button
    Then I should able to see the property details
