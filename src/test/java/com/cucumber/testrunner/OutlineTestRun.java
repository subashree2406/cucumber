package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\com\\cucumber\\feature\\AutoPracticewithOutline.feature",glue="com.cucumber.outlinestepdef",dryRun=false)
public class OutlineTestRun {
	
}
