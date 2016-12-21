@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Introduce Screen
  In order to user an app
  As a user
  I want to see the introduce screen

  Scenario: Introduce screen
    Given I am on the screen one
    When I click on continue button on screen one
    And I click on continue button on screen two
    And I click on continue button on screen three
    And I click on continue button on screen four
    Then I should see the introduce screen 