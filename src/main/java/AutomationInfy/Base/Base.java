package AutomationInfy.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Base {
    // driver should be visible for all the classes in the project
    public static WebDriver driver;
    //reusable method to launch browser
    public static void launchBrowser(String browser)
    {
        if(browser.equals("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equals("Edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
    }
    //reusable method to launch application
    public static void launchApp(String url)
    {
        driver.get(url);
    }
    //reusable method for implicit wait
    public static void implicitWait(long seconds)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    //reusable method to close application

    public static void closeChildWindow()
    {
        Set<String> windowids=driver.getWindowHandles();// store 2 window id's

        //Approach1 - using List collection

        List<String> windowidslist = new ArrayList<String>(windowids);

        String parentwindowid=windowidslist.get(0);
        String childwindowid=windowidslist.get(1);

        //switch to child window
        driver.switchTo().window(childwindowid);
        driver.close();
        driver.switchTo().window(parentwindowid);
    }

    public static void switchToChildWindow() {
        Set<String> windowids = driver.getWindowHandles();// store 2 window id's
        List<String> windowidslist = new ArrayList<String>(windowids);

        String parentwindowid = windowidslist.get(0);
        String childwindowid = windowidslist.get(1);
        // switch to child window
        driver.switchTo().window(childwindowid);
    }



    public static void closeApp()
    {
        driver.close();

    }
}
