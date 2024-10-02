package stepdefinitions;

import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.en.Then;
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
    //Asha

    @When("User clicks Solutions link on Header section Webpage.")
    public void user_clicks_solutions_link_on_header_section_webpage() {
        try {
            solutionsDisplay();
            solutionslink();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User verifies the solution page opens.")
    public void user_verifies_the_solution_page_opens() {
        try {
            solutionTextPresence();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User should verify solution page title.")
    public void user_should_verify_solution_page_title() {
        System.out.println("Navigated to Solutions page when clicked Header Section");
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = solutionTextPresence();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("Solution Text verified");
    }

    @Then("User should go back to home page from solutions page.")
    public void user_should_go_back_to_home_page_from_solutions_page() {
        try {
            backToHomePage();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User clicks on ContactUS link on Header section of Infyniconnect Webpage.")
    public void user_clicks_on_contact_us_link_on_header_section_of_infyniconnect_webpage() {
        try {
            ContactUSDisplay();
            contactUsLink();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User verifies the ContactUS page opens.")
    public void user_verifies_the_contact_us_page_opens() {
        try {
            contactUSTextPresence();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User should verify ContactUS page title.")
    public void user_should_verify_contact_us_page_title() {
        System.out.println("Navigated to ContactUS page when clicked on Header Section");
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = contactUSTextPresence();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("Contact Us Text verified");
    }

    @Then("User should go back to Homepage from ContactUs page.")
    public void user_should_go_back_to_homepage_from_contact_us_page() {
        try {
            backToHomePage();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
