package iConnectAutomation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features= {"C://Users//ramya//IdeaProjects//Ramya_Infyni_iConnectAutomation//Features//Footer.feature"},
        glue= {"stepdefinitions","hooks"},
        plugin={"pretty","html:target/htmlreport.html"},
        tags= "@FooterLinks",
        monochrome=true
)
public class Runner_Footer extends AbstractTestNGCucumberTests {
    @DataProvider(parallel=true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
