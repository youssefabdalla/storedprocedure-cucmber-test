/**
 * 
 */
package demo.model.integrationtests;

import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Here you can setup your tests and choose which tags to run .. etc.
 * 
 * @author Youssef Abdalla
 */
@CucumberOptions(monochrome = true, features = "src/test/resources/features", glue = "demo.model.integrationtests.stepdefinitions", plugin = {
		"pretty", "html:target/cukes" }, tags = { "@hr" }, strict = true)
public class RunnerIntegrationTest extends AbstractTestNGCucumberTests {
	}
