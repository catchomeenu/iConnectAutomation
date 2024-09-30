package stepdefinitions;

import iConnectAutomation.base.Base;
import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
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


}
