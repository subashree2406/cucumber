package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\com\\cucumber\\feature", glue="com.cucumber.stepdefinition",dryRun=false)
public class TestRun {

}
