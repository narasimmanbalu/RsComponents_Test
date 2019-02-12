
Feature: Remove item from shopping cart

  Scenario: Remove item from shopping cart
    Given User is in Home Page and click login link
    When user enters username  and password and click login button
    And click on shopping cart
    And click removelink on added item and logout