package stepdefinitions;

import iConnectAutomation.base.Base;
import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class FooterPageStepDefinitions extends HomePage {


    @When("User clicks on Privacy Policy Footer Link")
    public void user_clicks_on_privacy_policy_footer_link() {
        try {
            clickPrivacyPolicyLink();
            // System.out.println("Navigated to PrivacyPolicyPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User verify Privacy Policy text presence in Privacy Policy page")
    public boolean user_verify_privacy_policy_text_presence_in_privacy_policy_page() {

        try {
            verifyPrivacyPolicyTextPresence();
            //  System.out.println("PrivacyPolicyPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }


    @When("User clicks on TermsOfUse Footer Link")
    public void user_clicks_on_terms_of_use_footer_link() {

        try {
            clickTermsOfUseLink();
            // System.out.println("Navigated to termsOfUsePage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User verify TermsOfUse text presence in TermsOfUse page")
    public boolean user_verify_terms_of_use_text_presence_in_terms_of_use_page() {

        try {
            verifyTermsOfUseTextPresence();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }

    //sakthi

    @When("user click on the pricing link")
    public void user_click_on_the_pricing_link() {
        try {
            user_ClickPricing();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @And("user should be able to navigate the pricing page")
    public void user_should_be_able_to_navigate_the_pricing_page() {
        try {
            verify_Pricingpage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("user should be verify the Pricing text present")
    public void user_should_be_verify_the_pricing_text_present() {
        try {
            verify_PricingText();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @When("user click on the Capabilities link")
    public void user_click_on_the_capabilities_link() {
        try {
            user_ClickCapabilities();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @And("user should be able to navigate the Capabilities page")
    public void user_should_be_able_to_navigate_the_capabilities_page() {
        try {
            verify_Capabilitiespage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("user should be verify the text present")
    public void user_should_be_verify_the_text_present() {
        try {
            verify_CapabilitiesText();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
//Swathini's Methods

    @When("User clicks the contactus link")
    public void user_clicks_the_contactus_link() {
        userclicks_thecontactuslink();

    }

    @And("User validate the contactus text presence")
    public void user_validate_the_contactus_text_presence() {

        boolean Acutval = validatethe_contactustextpresence();
        boolean expected = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Acutval, expected);
        sa.assertAll();

        //throw new io.cucumber.java.PendingException();
    }

    @When("User clicks the Blog link")
    public void user_clicks_the_blog_link() {

        userclicks_bloglink();
    }

    @And("User validate the Blog text presence and close the newtab")
    public void user_validate_the_blog_text_presence_and_close_the_newtab() {
        validatetheblog_text_presence();
    }

//Priya's Methods

    @When("user click on the home link")
    public void user_click_on_the_home_link() {
        try {
            ClickHome_link();
            System.out.println("Home link clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("user should verify the text present")
    public boolean user_should_verify_the_text_present() {
        try {
            Verify_Keyfeature_text();
            System.out.println("Key Features text is verified");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    @When("user click on the AboutUs Link")
    public void user_click_on_the_about_us_link() {
        try {
            ClickAboutUs_link();
            System.out.println("About Us Link clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Sowmya's methods
    @When("The user scrolls down to the bottom")
    public void the_user_scrolls_down_to_the_bottom() {
        scroll_to_the_bottom();
    }
    @Then("USA office address should be displayed as {string}")
    public void usa_office_address_should_be_displayed(String expectedAddress) {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(verify_USA_ofc_address_Presence());
        sa.assertEquals(get_USA_ofc_address_Text(), expectedAddress);
    }
    @And("Karnataka office address should be displayed as {string}")
    public void karnataka_office_address_should_be_displayed_as(String expectedAddress) {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(verify_Karnataka_ofc_address_Presence());
        sa.assertEquals(get_Karnataka_ofc_address_Text(), expectedAddress);
    }
    @And("Haryana office address should be displayed as {string}")
    public void haryana_office_address_should_be_displayed_as(String expectedAddress) {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(verify_Haryana_ofc_address_Presence());
        sa.assertEquals(get_Haryana_ofc_address_Text(), expectedAddress);
    }

    @And("user should be able to verify the text present")
    public boolean user_should_be_able_to_verify_the_text_present() {
        try {
            VerifyAboutUs_linkText();
            System.out.println("About Us text is present");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Vimala's Methods
    @When("The user checks for mobile number")
    public void theUserChecksForMobileNumber() {
        scroll_to_the_bottom();
    }

    @Then("mobile number displayed as {string}")
    public void mobileNumberDisplayedAs(String expectedMobileNo) {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(get_InfyniConnect_Mobile_No(), expectedMobileNo);
    }


    @When("The user checks for email id")
    public void theUserChecksForEmailId() {
        scroll_to_the_bottom();
    }

    @Then("email id number displayed as {string}")
    public void emailIdNumberDisplayedAs(String expectedemailid) {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(get_InfyniConnect_email_Id(), expectedemailid);
    }
}




