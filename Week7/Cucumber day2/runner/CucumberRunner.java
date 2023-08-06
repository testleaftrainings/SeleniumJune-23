package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features"},
glue = {"steps"},
monochrome = true,
publish = true,
tags="@Smoke")//it will execute all the scenarios with @Smoke
//tags="not @Smoke")//it will exclude the particular scenario
//tags = "@Smoke or @Regression")
//tags="@Functional and @Smoke")
public class CucumberRunner extends BaseClass{

}
