package com.bookit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@regression",
        features = "src/test/resources/features",
        glue = "com/bookit/stepdefs",

        dryRun = false,
        plugin ={
                "json:target/cucumber.json",
                "pretty"
}
)
public class CukesRunner {

}
