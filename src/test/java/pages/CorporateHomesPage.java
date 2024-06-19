package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

public class CorporateHomesPage {

    private WebDriver driver;

    public CorporateHomesPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "corporate";

    public static String ExpectedURLQA = projectProperties.getProperty("QA_URL") + "corporate";

    public static String Dummy_URL = FoxtonsHooks.HOST + "corporate#";


    //    Page Elements

    public static String Enquire_now = "//button[contains(text(),'Enquire now')]";

    public static String Tell_us_your_requirements = "(//button[contains(text(),'Tell us your requirements')])[1]";

    public static String Tell_us_your_requirements_2 = "(//button[contains(text(),'Tell us your requirements')])[2]";


    // Functions

    public void click_Enquire_now(){
        driver.findElement(By.xpath(Enquire_now)).click();
    }
    public void click_Tell_us_your_requirements(){
        driver.findElement(By.xpath(Tell_us_your_requirements)).click();
    }
    public void click_Tell_us_your_requirements_2(){
        driver.findElement(By.xpath(Tell_us_your_requirements_2)).click();
    }

}
