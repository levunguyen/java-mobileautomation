@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Request Screen
  In order to user an app
  As a user
  I want to see the introduce screen

  Scenario: Request screen
    Given I click on request list icon
    Then I see the list of request
  Scenario: List all request
  	Given I scroll the request list
  	When I click back button
  	Then I see the main page