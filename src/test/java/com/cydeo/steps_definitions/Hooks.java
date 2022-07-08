package com.cydeo.steps_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before //coming from cucumber and running before each scenario
    public void setUpScenario(){
        System.out.println("--> It is coming from @Before in Hooks");
    }

    @After //coming from cucumber and running after each scenario
    public void tearDown(Scenario scenario){
        System.out.println("--> It is coming from @After in Hooks");

//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }

        Driver.closeDriver();
    }
}
