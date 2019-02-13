
Feature: Search with different options

@SearchTest
  Scenario Outline: Search with different options
  	Given User is in Home Page and click login link
    When user enters username  and password and click login button
    And user search the item with "<searchby>" as "<value>"
    And filter by first Categories
    And filter by Brand
    And apply filters for the search results
    Then logout from application

    Examples: 
      | searchby  	| value 		|
      | productname | Reedrelay	|
      | RsStockNo   | 909	      |
 
@SearchTest
  Scenario: Search by New Product
    Given User is in Home Page and click login link
    When user enters username  and password and click login button
    And click on New Product link
    And click Batteries from Categories 
    And filter by first Categories
    Then logout from application