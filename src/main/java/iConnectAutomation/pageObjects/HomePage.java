package iConnectAutomation.pageObjects;

import iConnectAutomation.base.Base;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

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



}
