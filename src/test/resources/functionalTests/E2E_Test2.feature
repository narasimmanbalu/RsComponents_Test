
Feature: Remove item from shopping cart

 @E2ETest
  Scenario: Remove item from shopping cart
    Given User is in Home Page and click login link
    When user enters "Balu1"  and "welcome" and click login button
    And click on shopping cart
    And click removelink on added item
    And logout from application