package hooks;

import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.FileNotFoundException;
import java.net.URLConnection;

public class Hooks extends HomePage {
    @Before
    public void beforeScenario() throws FileNotFoundException {
        browserLaunchSetup();
        System.out.println("InfyniConnect HomePage Launched ");
    }
    @After
    public void afterScenario(){
        browserCloseSetup();
        System.out.println("Redirected to InfyniConnect HomePage and closed the Browser");
    }
}
