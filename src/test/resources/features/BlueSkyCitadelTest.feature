Feature: BlueSky Form Test
  Scenario: Form Test
    Given I navigate to blueskycitadelform site
    When I click on Automation Testing site
    And I enter the Signle line text
    And I click on select
    And I enter email
    And I enter password
    And I click on multi-select
    And I click radio list
    And I click on checkbox list
    And I click on country
    And I enter date
    And I click on single checkbox
    And I enter paragraph text
    And I click on submit
    Then I close window
   # When I enter first name
    #And I enter Lastname
    #And I send age 18-30
    #And I click on Submit
    #Then the form is submitted
