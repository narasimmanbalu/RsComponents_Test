
Feature: Adding item to Shopping Cart
  
 @E2ETest
  Scenario: Adding item to Shopping Cart
    Given User is in Home Page and click login link
    When user enters "Balu1"  and "welcome" and click login button
    And user click on the All Product link and select Relay as main product type
    And select on Reed Relay as sub product
    And add spdt Reed Relay product to shoppig cart
    Then click checkout link on Cart page
    And logout from application