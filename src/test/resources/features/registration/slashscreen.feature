@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Slash Screen
  In order to attract user
  As a appler
  I want user see the slashscreen

  Scenario: SlashScreen
    Given I am on the mobile
    When I click on Mappion icon
    Then I should see the Slashscreen
  
   