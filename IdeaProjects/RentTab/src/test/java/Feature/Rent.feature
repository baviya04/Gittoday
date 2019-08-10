# new feature
# Tags: optional
    
Feature: verify rent tab
    
Scenario: Find house near ilford
    Given I am on homepage of zoopla
    When I click on rent tab
    And enter ilford in search
    Then select three bedroom
    Then click on search