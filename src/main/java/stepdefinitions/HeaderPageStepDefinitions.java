package stepdefinitions;

import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class HeaderPageStepDefinitions extends HomePage {


    @When("User clicks on Pricing Header Link")
    public void user_clicks_on_pricing_header_link() {

        try {
            clickPricingLink();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User verify Pricing text presence in Pricing page")
    public boolean user_verify_pricing_text_presence_in_pricing_page() {

        try {
            verifyPricingTextPresence();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}
