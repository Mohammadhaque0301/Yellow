package com.uk.zoopla.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
     features ="Cucumber_Features",
     glue = "com.uk.step.defination",
     plugin= {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
     dryRun = false, monochrome = true, strict = false
)   


public class ZooplaRunnerClass extends AbstractTestNGCucumberTests {

}
