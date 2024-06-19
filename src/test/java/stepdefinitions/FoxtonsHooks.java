package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.CommonMethods;
import utilities.ConfigReader;
import utilities.LoadTestProperties;
import utilities.PropertyKeys;

import java.util.Properties;

public class FoxtonsHooks {


    //public static WebDriver driver;

    private FoxtonsBrowserDrivers driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;

    public static final String HOST = LoadTestProperties.getProperties(PropertyKeys.HOST.getKey());
    public static final String BOSHOST = LoadTestProperties.getProperties(PropertyKeys.BOSHOST.getKey());

    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();

    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        driverFactory = new FoxtonsBrowserDrivers();
        driver = driverFactory.init_driver(browserName);
        driver.get(HOST);
        CommonMethods.clickCookie(driver);
    }

    @After(order = 0)
    public void quitBrowser() {
        driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot:
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
    }
}

