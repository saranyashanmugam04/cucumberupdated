package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/feature1.feature:8:22",
				glue="stepdef",
				//tags={"@login"})
				//tags={"~@regression"}) //ignore regression
				//tags={"@login","@regression"}) - AND case
				//tags={"@login,@regression"},
				//plugin="html:target\\HtmlReport") // OR case
				plugin="json:target\\Jsonreport.json")
				//plugin="junit:C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\xmlreport.xml")
public class RunnerClass {

}
