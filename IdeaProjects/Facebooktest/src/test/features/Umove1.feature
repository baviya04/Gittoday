# new feature
# Tags: optional
    
Feature: Verification Quick search tab
    
Scenario: Finding flats for sale in mumbai
    Given I am on umove india
    And I click on sale
    Then I have redirected to Quicksearch page
    And select type flat/Apartment
    And Mention No of Beds
    And select from the list the location
    And click on search
    Then i should able to see the properties of location which i selected

