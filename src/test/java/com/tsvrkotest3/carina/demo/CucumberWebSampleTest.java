package com.tsvrkotest3.carina.demo;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/GSMArenaNews.feature",
        glue = "com.tsvrkotest3.cucumber.steps",
        format={"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json",
                "junit:target/cucumber-core-test-report.xml"}
        //,plugin = "json:target/cucumber1.json"
)
public class CucumberWebSampleTest extends CucumberBaseTest {
    //do nothing here as everything is declared in "GSMArenaNews.feature" and steps

}
