@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Static Screen
  In order to user an app
  As a user
  I want to see the introduce screen

  Scenario: Static screen
    Given I click on statistic
    When I click on 日
    When I click on 週
    When I click on 月
    When I click on 月
    When I click back button
    Then I should go back to main app