@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Mission Screen
  In order to user an app
  As a user
  I want to see the introduce screen

  Scenario: Mission screen
    Given I click on mission list icon
    Then I see the list of request
  Scenario: List all mission
  	Given I scroll the mission list
  	When I click back button
  	Then I see the main page