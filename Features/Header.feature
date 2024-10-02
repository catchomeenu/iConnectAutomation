Feature: This Feature runs for Checking infyniConnect HomePage Header Links Functionality


  @HeaderLinks
  Scenario: Verification of Pricing link functionality

    When  User clicks on Pricing Header Link
    And   User verify Pricing text presence in Pricing page

  @HeaderLinks
  Scenario: Description of Scenario-User should click on solutions link  on Header Section of Webpage

    When User clicks Solutions link on Header section Webpage.
    And  User verifies the solution page opens.
    And  User should verify solution page title.
    Then User should go back to home page from solutions page.

  @HeaderLinks
  Scenario: Description of Scenario-User should click on  ContactUS link on Header Section of Webpage.

    When User clicks on ContactUS link on Header section of Infyniconnect Webpage.
    And  User verifies the ContactUS page opens.
    And  User should verify ContactUS page title.
    Then User should go back to Homepage from ContactUs page.




