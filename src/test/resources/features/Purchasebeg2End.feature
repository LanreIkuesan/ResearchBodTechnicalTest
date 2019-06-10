Feature: Login and Purchase

  Scenario: I want to Login and Purchase an Item

    Given I am on the application home screen
    And I am successfully logged in
    And I click on women and then dresses
    And I add random products to cart
    When i check that the product in Shopping cart has the correct price and my details are correct
    And  I go through all steps to checkout my order
    Then my order should be confirmed