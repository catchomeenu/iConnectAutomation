Feature: This Feature runs for Checking infyniConnect HomePage Footer Links Functionality


  @FooterPrivacyPolicyLink  @FooterLinks
  Scenario: Verification of PrivacyPolicy link functionality

    When  User clicks on Privacy Policy Footer Link
    And   User verify Privacy Policy text presence in Privacy Policy page


  @FooterTermsOfUseLink  @FooterLinks
  Scenario: Verification of TermsOfUse link functionality

    When  User clicks on TermsOfUse Footer Link
    And   User verify TermsOfUse text presence in TermsOfUse page






