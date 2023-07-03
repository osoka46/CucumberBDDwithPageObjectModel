package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.SeleniumDriver;

public class Hooks {
    @Before
    public void setUp() {
        SeleniumDriver.setUpDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = SeleniumDriver.getDriver();
        System.out.println(scenario.isFailed());

        if (scenario.isFailed()) {
            byte[] screenShotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShotBytes, "image/png","Bartholomew and the Bytes of the Oobleck");
        }
        SeleniumDriver.tearDown();


        System.out.println("browser tearing down");

    }


}
