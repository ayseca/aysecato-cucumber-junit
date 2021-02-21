package com.aysecato.step_definitions;

import com.aysecato.utilities.BrowserUtils;
import com.aysecato.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After()
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(1);
        Driver.closeDriver();
    }

}
