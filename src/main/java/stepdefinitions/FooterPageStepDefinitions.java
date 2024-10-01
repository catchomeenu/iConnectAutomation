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
    public void user_clicks_the_contactus_link()
    {
        userclicks_thecontactuslink();

    }
    @And("User validate the contactus text presence")
    public void user_validate_the_contactus_text_presence() {

        boolean Acutval=validatethe_contactustextpresence();
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


}
