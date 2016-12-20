@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Start Screen
  In order to user an app
  As a user
  I want to see the start screen

  Scenario: Start screen
    Given I am on the mobile
    When I click on Mappion icon
    Then I should see the start screen
  
   