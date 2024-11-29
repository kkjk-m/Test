package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions", monochrome=true, tags="Test01 and @Test02")

public class TestNGRunner extends AbstractTestNGCucumberTests{

}
