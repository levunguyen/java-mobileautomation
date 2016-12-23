@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Request Screen
  In order to user an app
  As a user
  I want to see the introduce screen

  Scenario: Request screen
    Given I on request screen
    Then I see the request
  Scenario: Request Collection
  	Given I click on request collection
  	Then I see the list of collection  
  	And I return my home
    
  