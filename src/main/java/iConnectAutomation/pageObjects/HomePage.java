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
    public static By homePageIcon = By.xpath("//li[@class='breadcrumb-item']/a/i[@class='fa fa-home pr-1']");
    public static By pricingLink = By.xpath("//a[@class='nav-link' and text()='Pricing']");
    public static By pricingText = By.xpath("//h1[@class='text-white mb-1' and text()='Pricing']");
    public static By homePageText=By.xpath("//span[@class='badge badge-primary badge-primary-soft mb-4']");
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



    public static void clickHomePageIcon() {
        try {
            driver.get().findElement(homePageIcon).click();
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
        clickHomePageIcon();
        verifyHomePageTextPresence();
        quitDriver();

    } catch (Exception e) {
        e.printStackTrace();
    }

    }

}
