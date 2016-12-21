@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Register 
  In order to user an app
  As a user
  I want to see the introduce screen

  Scenario: Register
    Given I am on the registor screen one
    When I click on continue button on screen one
    And I enter name
    And I enter birthday
    And I enter sexual
    And I enter zipcode
    And I enter height
    And I enter kg
    And I click register
    Then I should see the introduce screen