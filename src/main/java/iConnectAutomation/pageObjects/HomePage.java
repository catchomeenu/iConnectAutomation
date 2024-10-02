package iConnectAutomation.pageObjects;

import iConnectAutomation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;

public class HomePage extends Base {
//Ramya Links
    public static By privacyPolicyLink = By.xpath("//a[@class='text-white' and text()='Privacy Policy']");
    public static By privacyPolicyText = By.xpath("//h1[@class='text-white mb-1' and text()='Privacy Policy']");
    public static By termsOfUseLink = By.xpath("//a[@class='text-white' and normalize-space()='Terms of use']");
    public static By termsOfUseText = By.xpath("//h1[@class='text-white mb-1' and text()='Terms of Services']");
    public static By homeLink = By.xpath("//a[@class='nav-link' and text()='Home']");
    public static By pricingLink = By.xpath("//a[@class='nav-link' and text()='Pricing']");
    public static By pricingText = By.xpath("//h1[@class='text-white mb-1' and text()='Pricing']");
    public static By homePageText=By.xpath("//span[@class='badge badge-primary badge-primary-soft mb-4']");
    //sakthi
    public static By clickPricinglink=  By.linkText("Pricing");
    public static By verifyPricingText=By.xpath("//h1[@class='text-white mb-1']");
    public static By clickCapabilitieslink=By.linkText("Capabilities");
    public static By verifyCapabilitiesText=  By.xpath("//h1[@class='font-weight-normal text-white text-center']");
    //Swathini
    public static By click_contactUs = By.linkText("Contact Us");
    public static By validatethe_contactus =By.xpath ("//h1[contains(text(),'Contact Us')]");
    public static By home=By.linkText("Home");
    public static By click_blog=By.linkText("Blog");
    public static By validate_blog=By.xpath("//h1[contains(text(),'Blog has been removed')]");
    //Asha
    public static By solutions = By.xpath("//a[@class='nav-link' and text()='Solutions']");
    public static By contactus = By.xpath("//a[@class='nav-link' and text()='Contact Us']");
    public static By InfyLogo = By.xpath("//img[@alt='infyni']");
    //Navigation of Solution page and Contactus page
    public static By solutionsPage = By.xpath("//div/h1[@class='text-white mb-1' and text()='Solutions']");
    public static By contactUSPage = By.xpath("//div/h1[@class='text-white mb-1' and text()='Contact Us']");
    public static By backtoHomepagelink = By.xpath("//li[@class='breadcrumb-item']");
    //Asha Methods
    public static void solutionslink() {
        try {
            driver.get().findElement(solutions).click();
            System.out.println("Solutions Link is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void solutionsDisplay() {
        try {
            driver.get().findElement(solutions).isDisplayed();
            System.out.println("Solutions Link is Displayed ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void contactUsLink() {
        try {
            driver.get().findElement(contactus).click();
            System.out.println("ContactUS  is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void ContactUSDisplay() {
        try {
            driver.get().findElement(contactus).isDisplayed();
            System.out.println("ContactUS  is Displayed ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //back to home page from solution page and contactUs page of header section
    public static void navigateBackToHome() {
        String mainWindow = driver.get().getWindowHandle();
        Set<String> windows = driver.get().getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            if (!childWindow.equals(mainWindow)) {
                try {
                    driver.get().switchTo().window(childWindow);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Get the title of the child window's page
                String windowTitle = driver.get().getTitle();
                if (windowTitle.contains("Expected Title")) {
                    driver.get().close();
                    driver.get().switchTo().window(mainWindow);
                    return;
                }
            }
        }
    }

    public static void backToHomePage() {
        try {
            driver.get().findElement(backtoHomepagelink).click();
            System.out.println("Back to home link  is clicked ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean solutionTextPresence() {

        try {
            driver.get().findElement(solutionsPage).isDisplayed();
            System.out.println("We are on solutions Page ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }

    public static boolean contactUSTextPresence() {
        try {
            driver.get().findElement(contactUSPage).isDisplayed();
            System.out.println("We are on ContactUS Page ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static void solutionsLinkVerify() {

        System.out.println("Navigated to Solutions page when clicked Header Section");
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = solutionTextPresence();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("Solution Text verified");
    }

    public static void contactUsLinkVerify() {

        System.out.println("Navigated to ContactUS page when clicked on Header Section");
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = contactUSTextPresence();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("Contact Us Text verified");
    }


    //Ramya Methods
   public static void browserLaunchSetup() {
        try
        {
            launchApp() ;
        }
        catch (Exception e) {
        e.printStackTrace();
    }

    }

    public static void clickPrivacyPolicyLink() {
        try {
            driver.get().findElement(privacyPolicyLink).click();
           // System.out.println("Navigated to PrivacyPolicyPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyPrivacyPolicyTextPresence() {
        try {
            boolean actualresult = driver.get().findElement(privacyPolicyText).isDisplayed();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
          //  System.out.println("PrivacyPolicyPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }


    public static void clickTermsOfUseLink() {
        try {
            driver.get().findElement(termsOfUseLink).click();
          //  System.out.println("Navigated to TermsOfUse Page");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyTermsOfUseTextPresence() {
        try {
            boolean actualresult =  driver.get().findElement(termsOfUseText).isDisplayed();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
            //   System.out.println("TermsOfUsePage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }



    public static void clickPricingLink() {
        try {
            driver.get().findElement(pricingLink).click();
            // System.out.println("Navigated to PrivacyPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyPricingTextPresence() {
        try {
            boolean actualresult = driver.get().findElement(pricingText).isDisplayed(); ;
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
            //  System.out.println("PricingPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }



    public static void clickBacktoHome() {
        try {
            driver.get().findElement(homeLink).click();
            //  System.out.println("Navigated to HomePage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyHomePageTextPresence() {
        try {
            boolean actualresult =  driver.get().findElement(homePageText).isDisplayed();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
            //  System.out.println("Homepage Text Verified");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }


    public static void browserCloseSetup()
    { try
    {
        clickBacktoHome();
        verifyHomePageTextPresence();
        quitDriver();

    } catch (Exception e) {
        e.printStackTrace();
    }

    }

    //sakthi
    public static void user_ClickPricing() {
        try {
            driver.get().findElement(clickPricinglink).click();
            System.out.println("Pricing link Clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void verify_Pricingpage() {
        try {
            implicitWait(30);
            String URL = driver.get().getCurrentUrl();
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(URL, "https://dev.infyniconnect.com/enterprise_users/connect_pricing/");
            System.out.println("Pricing page displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_PricingText() {
        try {
            String actualText = driver.get().findElement(verifyPricingText).getText();
            String expectedText = "Pricing";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualText, expectedText);
            System.out.println("Verified the Pricing text");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public static void user_ClickCapabilities() {
        try {
            driver.get().findElement(clickCapabilitieslink).click();
            System.out.println("Capabilities link Clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_Capabilitiespage() {
        try {
            implicitWait(30);
            String URL = driver.get().getCurrentUrl();
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(URL, "https://dev.infyniconnect.com/enterprise_users/connect_capabilities/");
            System.out.println("Capabilities page displayed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_CapabilitiesText() {
        try {
            String actualText = driver.get().findElement(verifyCapabilitiesText).getText();
            String expectedText = "Unlock Your Potential with Our Expert Staffing Solutions";

            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualText, expectedText);
            System.out.println("Verified the text for capabilities");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

   //swathini's Methods

    public void userclicks_thecontactuslink()
    {

        driver.get().findElement(click_contactUs).click();
    }

    public boolean validatethe_contactustextpresence()
    {

        boolean value= false;
        try {
            WebElement actual= driver.get().findElement(validatethe_contactus);
            value = actual.isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;

    }

    public void userclicks_bloglink() {
        driver.get().findElement(click_blog).click();
        //throw new io.cucumber.java.PendingException();
    }

    public void validatetheblog_text_presence() {
        String parentWindow = driver.get().getWindowHandle();

        Set<String> windows = driver.get().getWindowHandles();

        Iterator<String> itr = windows.iterator();

        while (itr.hasNext()) {
            String child = itr.next();

            if (!(child.equals(parentWindow))) {
                driver.get().switchTo().window(child);

                WebElement actual = driver.get().findElement(validate_blog);

                boolean value1 = actual.isDisplayed();
                boolean expected = true;
                SoftAssert sa = new SoftAssert();
                sa.assertEquals(value1, expected);
                sa.assertAll();
                driver.get().close();
                driver.get().switchTo().window(parentWindow);

            }

        }


    }


}
