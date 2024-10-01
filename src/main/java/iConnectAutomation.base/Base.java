package iConnectAutomation.base;

import iConnectAutomation.utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ThreadGuard;

import java.io.FileNotFoundException;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Base {
    // driver should be visible for all the classes in the project
   // public static WebDriver driver;
    public static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    //reusable method to launch browser
    public static void launchBrowser(String browser)
    {
        if(browser.equals("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
           // driver=new ChromeDriver();
            driver.set(ThreadGuard.protect(new ChromeDriver()));
        }

        else if(browser.equals("Edge"))

        {
            WebDriverManager.edgedriver().setup();
          //  driver=new EdgeDriver();
            driver.set(ThreadGuard.protect(new EdgeDriver()));
        }
        driver.get().manage().window().maximize();
    }
    //reusable method to launch application
    public static void launchApp() throws FileNotFoundException {
        launchBrowser("Chrome");
        String url= PropertyReader.readDataFromPropertyFile("dev_appurl");
        driver.get().get(url);
        implicitWait(30);
       
    }

   /* public static WebDriver getDriver()
    {
        return driver.get();
    }*/
    //reusable method for implicit wait
    public static void implicitWait(long seconds)
    {
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    //reusable method to close application

    public static void closeChildWindow()
    {
        Set<String> windowids=driver.get().getWindowHandles();// store 2 window id's

        //Approach1 - using List collection

        List<String> windowidslist = new ArrayList<String>(windowids);

        String parentwindowid=windowidslist.get(0);
        String childwindowid=windowidslist.get(1);

        //switch to child window
        driver.get().switchTo().window(childwindowid);
        driver.get().close();
        driver.get().switchTo().window(parentwindowid);
    }

    public static void switchToChildWindow() {
        Set<String> windowids = driver.get().getWindowHandles();// store 2 window id's
        List<String> windowidslist = new ArrayList<String>(windowids);

        String parentwindowid = windowidslist.get(0);
        String childwindowid = windowidslist.get(1);
        // switch to child window
        driver.get().switchTo().window(childwindowid);
    }



    public static void closeApp()
    {
        driver.get().close();

    }
    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }
}
