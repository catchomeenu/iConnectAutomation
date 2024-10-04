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

  @FooterHome,@FooterLinks
  Scenario: Verification of Home link functionality

    When user click on the home link
    And user should verify the text present


  @FooterAboutUs,@FooterLinks
  Scenario: Verification of AboutUs link functionality

    When user click on the AboutUs Link
    And user should be able to verify the text present


  @FooterLocations,@FooterLinks
  Scenario: Verification of the various office locations of Infyni
    When The user scrolls down to the bottom
    Then USA office address should be displayed as "USA: 26211 Central Park Blvd, Southfield, MI 48076, United States"
    And Karnataka office address should be displayed as "India: 1589/B 3rd Floor, Aashvi complex, 100 Feet Ring Rd, Kadarenahalli Park, Banashankari Stage II, Banashankari, Bengaluru, Karnataka 560070"
    And Haryana office address should be displayed as "India: #701, 7th Floor, Eros City Square, Sector 49, Gurgaon, Haryana, 122018"


  @FooterLocations,@FooterLinks
  Scenario: Verification of Mobile Number of InfyniConnect
    When The user checks for mobile number
    Then mobile number displayed as "+91-1234567890"


  @FooterLocations,@FooterLinks
  Scenario: Verification of email id of InfyniConnect
    When The user checks for email id
    Then email id number displayed as "contact@infyni.com"



