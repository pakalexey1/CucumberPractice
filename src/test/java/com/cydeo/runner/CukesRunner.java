package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/test/resources/features",
            glue = "com/cydeo/steps_definitions",
            dryRun = false, //true means "only get snippets", so it will run only feature file to get the snippet
            tags = "@smoke"

    )
    public class CukesRunner {

}
