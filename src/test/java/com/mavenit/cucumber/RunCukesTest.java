package com.mavenit.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        dryRun = false,
        strict = false,
        tags =  "~@ignore",
        plugin = {"json:target/cucumber.json"}
)
public class RunCukesTest {
}