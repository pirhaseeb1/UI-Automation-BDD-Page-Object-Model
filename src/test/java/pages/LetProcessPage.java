package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

import static pages.PortalValuationPage.*;

public class LetProcessPage {

    private WebDriver driver;

    public LetProcessPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String ExpectedURLStage = projectProperties.getProperty("STAGE_URL") + "let/let_process";

    public static String ExpectedURLQA =projectProperties.getProperty("QA_URL") + "let/let_process";
    //Dummy URL have to change
    public static String Dummy_URL = FoxtonsHooks.HOST + "myfoxtons/applicants";

    public static String Expected_RegisterNow_url= FoxtonsHooks.HOST + "auth/registration";
    // page object locators

    public static String Register_now = "//button[contains(text(),'Register now')]";

    public static String Benefits_of_registering = "//button[contains(text(),'Benefits of registering')]";
    //Functions
    public void click_Register_now(){
        driver.findElement(By.xpath(Register_now)).click();
    }

    public void click_Benefits_of_registering(){
        driver.findElement(By.xpath(Benefits_of_registering)).click();
    }
}
