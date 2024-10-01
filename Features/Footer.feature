Feature: This Feature runs for Checking infyniConnect HomePage Footer Links Functionality


  @FooterPrivacyPolicyLink  @FooterLinks
  Scenario: Verification of PrivacyPolicy link functionality

    When  User clicks on Privacy Policy Footer Link
    And   User verify Privacy Policy text presence in Privacy Policy page


  @FooterTermsOfUseLink  @FooterLinks
  Scenario: Verification of TermsOfUse link functionality

    When  User clicks on TermsOfUse Footer Link
    And   User verify TermsOfUse text presence in TermsOfUse page

  @FooterPricing,@FooterLinks
  Scenario:Verification of Pricing link functionality


    When user click on the pricing link
    And  user should be able to navigate the pricing page
    And  user should be verify the Pricing text present

  @FooterCapabilities,@FooterLinks
  Scenario:Verification of Capabilities link functionality

    When  user click on the Capabilities link
    And   user should be able to navigate the Capabilities page
    And   user should be verify the text present

  @FooterContactus,@FooterLinks
  Scenario:Verification of Contactus link functionality

    When User clicks the contactus link
    And  User validate the contactus text presence

  @FooterBlog,@FooterLinks
  Scenario: Verification of Blog link functionality
    When User clicks the Blog link
    And User validate the Blog text presence and close the newtab






