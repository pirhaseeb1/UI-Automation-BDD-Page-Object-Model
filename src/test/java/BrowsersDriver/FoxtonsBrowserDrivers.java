package BrowsersDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FoxtonsBrowserDrivers {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    //Used to initialize Threadlocal driver on basis of given driver
    public WebDriver init_driver(@NotNull String browser){
        System.out.println("browser value is "+browser);
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        }
       else if(browser.equals("hchrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
	    options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--no-sandbox"); // Bypass OS security model 
	    tlDriver.set(new ChromeDriver(options));

       }
        else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }
        else if (browser.equals("edge")) {
            //System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/msedgedriver.exe");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            tlDriver.set(new EdgeDriver());

        }
        else if (browser.equals("safari")) {
            tlDriver.set(new SafariDriver());
        }
        else {
            System.out.println("Please pass the correct browser value: "+browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }
    //Used to get driver with Threadlocal
    // "synchronized" for parallel execution
    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }
}
