package com.bookit.stepdefs;

import java.util.concurrent.TimeUnit;

import com.bookit.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {


    @Before
    public void setUp() {

        WebDriver driver = Driver.getDriver();
        try{
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println(" Could not maximize window");
        }

    }

    @After
    public void tearDown(Scenario scenario) {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // adding the screenshot to the report
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }





}
