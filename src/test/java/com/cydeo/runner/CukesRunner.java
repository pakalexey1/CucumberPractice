package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "rerun:target/rerun.txt",
//                "html:target/cucumber_report.html",
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/steps_definitions",
        dryRun = false, //true means "only get snippets", so it will run only the feature file to get the snippets
        tags = ""
)

public class CukesRunner {
}
