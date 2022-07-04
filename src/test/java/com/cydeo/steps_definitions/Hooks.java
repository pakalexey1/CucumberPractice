package com.cydeo.steps_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before //coming from cucumber and running before each scenario
    public void setUpScenario(){
        System.out.println("--> It is coming from @Before in Hooks");
    }

    @After //coming from cucumber and running after each scenario
    public void tearDown(){
        System.out.println("--> It is coming from @After in Hooks");
        Driver.getDriver().quit();
    }
}
