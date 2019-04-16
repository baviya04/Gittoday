# new feature
# Tags: optional
    
Feature: I should able to register in facebookpage

@regressionpack1
Scenario: register with vaild data
    Given I am on facebook page
    When i enter firstname
    And I enter surname
    And I enter mobilenumber or emailaddress
    And I enter password
    And I enter date of birth
    And I select gender
    And i click on submit
    Then I should able to register successfully

